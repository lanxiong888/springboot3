package com.atguigu.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

//@EnableWebMvc//会禁用默认配置
@Configuration
public class MyConfig /*implements WebMvcConfigurer*/ {
    /* @Override
     public void addResourceHandlers(ResourceHandlerRegistry registry) {
         //保留以前配置
         WebMvcConfigurer.super.addResourceHandlers(registry);
         registry.addResourceHandler("/static/**")
                 .addResourceLocations("classpath:/new/", "classpath:/wj/")
                 .setCacheControl(CacheControl.maxAge(7200, TimeUnit.SECONDS));

     }*/
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                WebMvcConfigurer.super.addResourceHandlers(registry);
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/new/", "classpath:/wj/")
                        .setCacheControl(CacheControl.maxAge(7200, TimeUnit.SECONDS));
            }
        };
    }
}
