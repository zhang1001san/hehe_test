package com.it.controller;

import com.it.domain.Account;
import com.it.domain.Student;
import com.it.domain.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @创建人 Administrator
 * @创建时间 2018/8/18
 * @描述 请求参数绑定
 */
@Controller  //控制器
@RequestMapping("/param")   //一级请求参数
public class ParamController {

    /**
     * 请求参数的绑定说明
     *
     * 绑定机制
     *    1. 表单提交的数据都是k=v格式的	username=haha&password=123
     *    2. SpringMVC的参数绑定过程是把表单提交的请求参数，作为控制器中方法的参数进行绑定的
     *    3. 要求：提交表单的name和参数的名称是相同的
     * @param username
     * @param money
     */
    @RequestMapping(value = "/save1")//二级请求参数
    public String save1(String username,Integer money){
        System.out.println("username:"+username);
        System.out.println("money:"+money);
        return "success";
    }

    /**
     * 请求参数绑定之实体类型（JavaBean）绑定
     * @param account
     * @return
     */
    @RequestMapping(value = "/saveAccount")
    public  String saveAccount(Account account){

        System.out.println(account);
        return "success";
    }

    /**
     * 请求参数绑定之集合数据类型（List、map集合等）绑定
     * @param student
     * @return
     */
    @RequestMapping(value = "/saveCollection")
    public String saveCollection(Student student){
        System.out.println(student);
        return  "success";
    }

    /**
     * 字符串转换为日期格式
     * 1.在需要转换为日期的类的成员属性加注解
     * @param teacher
     * @return
     */
    @RequestMapping(value = "/conventDate")
    public String conventDate(Teacher teacher){
        System.out.println(teacher);
        return "success";
    }

    /**
     * 在控制器中使用原生的ServletAPI对象
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/servlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){

        System.out.println("request:"+request);
        System.out.println("response:"+response);
        HttpSession session = request.getSession();
        System.out.println("session:"+session);
        ServletContext servletContext = session.getServletContext();
        System.out.println("servletContext:"+servletContext);
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie);
        }

        return  "success";
    }

}
