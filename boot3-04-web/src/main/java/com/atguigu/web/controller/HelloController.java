package com.atguigu.web.controller;

import com.atguigu.web.bean.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
//    @GetMapping("/a*/**/b?/{p1:[a-f]+}/**")
//    public String hello(HttpServletRequest request, @PathVariable("p1") String path) {
//        log.info("路径变量p1：{}", path);
//        String url = request.getRequestURI();
//        return url;
//    }
    @GetMapping("/person")
    public Person person() {
        return new Person(1L,"张三","1@qq.com",18,"admin");
    }


    public  void add() throws Exception {
        Person person = new Person();
        person.setId(1L);
        person.setUserName("张三");
        person.setEmail("aaa@qq.com");
        person.setAge(18);

        YAMLFactory factory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        ObjectMapper mapper = new ObjectMapper(factory);

        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }
}
