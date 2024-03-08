package com.atguigu.web.controller;

import com.atguigu.web.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebComeController {
    @GetMapping("/well")
    public String hello(@RequestParam(value = "name") String name,
                        Model model) {
        String text = "<span style='color:red'>"+name+"</span>";
        model.addAttribute("msg", text);
        model.addAttribute("imgUrl","/8.jpg");
        model.addAttribute("style","width:400px");
        model.addAttribute("show","true");
        model.addAttribute("name", name);
        return "welcome";
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/list")
    public String list(Model model){
        List<Person> list = Arrays.asList(
                new Person(1L, "张三", "", 18,"pm"),
                new Person(2L, "李四", "1@qq.com", 18,"hr"),
                new Person(3L, "王五", "1@qq.com", 18,"admin")

        );
        model.addAttribute("persons", list);
        return "list";
    }
}
