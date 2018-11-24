package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //   控制器       把本类放到到IOC容器中
public class HelloController {



    @RequestMapping(path = "/hello.do")
    public String sayHello(){
        System.out.println("hello springmvc !!!");
        /*return "/jsp/success.jsp";*/
        return "success";
    }
}
