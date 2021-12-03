package com.attanghao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping(
            value = {"testRequestMapping", "test"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    public String success() {
        return "success";
    }

    @RequestMapping(value = "/testPut", method = {RequestMethod.PUT})
    public String testPut() {
        return "success";
    }
    @RequestMapping(value = "/testParams", params = {"username=tanghao", "password!=123456"})
    public String testParams() {
        return "success";
    }
    @RequestMapping("/testRest/{id}/{username}")
    public String testRest(@PathVariable("id") String id, @PathVariable("username") String username) {
        System.out.println("id:" + id + "username:" + username);
        return "success";
    }
// 最终输出的内容为 --> id:1,username:admin
}
