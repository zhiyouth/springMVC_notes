package com.attanghao.mvc.controller;
import com.attanghao.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        return "success";
    }
    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam("user_name") String username,
            String password,
            String[] hobby,
            @RequestHeader("Host") String host,
//            HttpServletRequest request
            @CookieValue("JSESSIONID") String JSESSIONID
    ) {
//        final HttpSession session = request.getSession(); // 设置JSESSION
        System.out.println(username);
        System.out.println(password);
        System.out.println("host: "+host);
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(hobby[i]);
        }
        System.out.println("JSESSIONID: " + JSESSIONID);
        return "success";
    }


    @RequestMapping("/testBean")
    public String testBean(User user) {
        System.out.println(user);
        return "success";
    }
}
