package com.attanghao.mvc.controller;

import com.attanghao.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HttpController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String responseBody) {
        System.out.println(responseBody);
        return "success";
    }
    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        // 当前 requestEntity 表示整个请求报文的信息
        System.out.println("请求头信息: " + requestEntity.getHeaders());
        System.out.println("请求体: " + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello,response");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }
    @RequestMapping("testResponseUser")
    @ResponseBody
    public User testResponseUser() {
        return new User(1001, "admin", "123456", 23, "男");
    }

    @RequestMapping("testResponseUser")
    @ResponseBody
    public String testAxios(String username, String password) {
        System.out.println(username + "," + password);
        return "hello,axios";
    }

}
