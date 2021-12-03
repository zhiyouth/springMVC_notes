package com.attanghao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    /**
     * 使用RESTFul 模拟用户资源的增删改查
     * /user GET
     * /user/1 GET
     * /user PUT
     * /USER POST
     * /user/1 DELETE
     */

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String getAllUser() {
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable String id) {
        System.out.println("查询单个用户信息 id" + id);
        return "success";
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    public String insertUser(String username, String password) {
        System.out.println("添加用户信息：" + username + "," + password);
        return "success";
    }

    @RequestMapping(value = "user", method = RequestMethod.PUT)
    public String updateUser(String username, String password) {
        System.out.println("修改用户信息：" + username + "," + password);
        return "success";
    }
}
