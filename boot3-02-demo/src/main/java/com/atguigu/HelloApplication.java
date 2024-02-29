package com.atguigu;

import com.atguigu.boot.bean.Sheep;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        var ioc = SpringApplication.run(HelloApplication.class, args);
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        String[] forType = ioc.getBeanNamesForType(User.class);
        for (String beanName : forType) {
            System.out.println(beanName);
        }
        Object userhaha1 = ioc.getBean("userhaha");
        Object userhaha2 = ioc.getBean("userhaha");
        System.out.println(userhaha1==userhaha2);

        String[]  beans = ioc.getBeanNamesForType(User.class);
        for (String bean : beans) {
            System.out.println(bean);
        }
//
//        Pig bean = ioc.getBean(Pig.class);
//        System.out.println(bean);
        Sheep sheep = ioc.getBean(Sheep.class);
        System.out.println(sheep);
    }

}
