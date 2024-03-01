package com.atguigu.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class HelloController {
//    Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/hello")
    public String hello() {
        log.trace("trace 进来了");
        log.debug("debug 进来了");
        log.info("hahaha方法进来了");
        log.warn("warn 进来了");
        log.error("error 进来了");
        return "hello";
    }
}
