package com.attanghao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    // 访问首页
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    // 访问首页
    @RequestMapping("/target")
    public String target() {
        return "target";
    }
}
