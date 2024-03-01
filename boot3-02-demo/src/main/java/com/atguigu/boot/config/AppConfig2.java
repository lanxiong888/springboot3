package com.atguigu.boot.config;

import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
@EnableConfigurationProperties(Sheep.class)
public class AppConfig2 {
    @Bean
//    @ConditionalOnClass(name="com.alibaba.druid.FastsqlException")
    @ConditionalOnClass(FastsqlException.class)
    public Cat cat01() {
        return new Cat();
    }

    @Bean
    @ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
    public Dog dog01() {
        return new Dog();
    }

    @Bean
    @ConditionalOnBean(Cat.class)
    public User user01() {
        return new User();
    }

    @Bean
    @ConditionalOnMissingBean(Cat.class)
    public User user02() {
        return new User();
    }

    @Bean
    @ConfigurationProperties(prefix = "pig")
    public Pig pig01(){
        return new Pig();
    }
}
