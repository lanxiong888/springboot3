package com.atguigu.boot.config;

import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

//@Configuration
@SpringBootConfiguration
@Import(FastsqlException.class)
public class AppConfig {

    @Bean("userhaha")
    @Scope("prototype")
    public User user(){
        return new User(1L,"杰克");
    }
//    @Bean("fastsqlException")
//    @Scope("prototype")
//    public FastsqlException fastsqlException(){
//        return new FastsqlException();
//    }
}
