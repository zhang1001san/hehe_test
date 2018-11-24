package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @创建人 Administrator
 * @创建时间 2018/8/18
 * @描述
 */
@Controller  //控制器
@RequestMapping(value = "/haha")
public class RequestController {


    @RequestMapping(value = "/begin",method = RequestMethod.GET,params = {"username=abc"},headers = {"host"})
    public String begin(){
        System.out.println("hello world !");
        return "success";
    }
}
