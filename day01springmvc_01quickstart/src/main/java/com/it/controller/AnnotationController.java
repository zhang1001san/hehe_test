package com.it.controller;

import com.it.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * @创建人 Administrator
 * @创建时间 2018/8/18
 * @描述  常用的注解
 *
 */
@Controller
@RequestMapping(path = "/annotation")
@SessionAttributes(value = {"msg"})//把request域对象中的msg=哈哈存到session域对象中
public class AnnotationController {

    /**
     * RequestParam注解
     *  解决表单参数和控制器接收参数名称不一致问题
     * 1. 作用：把请求中的指定名称的参数传递给控制器中的形参赋值
     * 2. 属性
     *    1. value：请求参数中的名称
     *    2. required：请求参数中是否必须提供此参数，默认值是true，必须提供
     * @param username
     * @return
     */
    @RequestMapping("/requestParam")
    public  String testRequestParam(@RequestParam(name = "name",required = false,defaultValue = "哈哈") String username){

        System.out.println("username:"+username);
        return "success";
    }

    /**
     * RequestBody注解
     *
     * 1. 作用：用于获取请求体的内容（注意：get方法不可以）
     * 2. 属性
     *    1. required：是否必须有请求体，默认值是true
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public  String testRequestBody(@RequestBody String body){
        System.out.println("请求体内容：");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVaribale注解
     *
     * 1. 作用：拥有绑定url中的占位符的。例如：url中有/delete/{id}，{id}就是占位符
     * 2. 属性
     *    1. value：指定url中的占位符名称
     * 3. Restful风格的URL
     *    1. 请求路径一样，可以根据不同的请求方式去执行后台的不同方法
     *    2. restful风格的URL优点
     *       1. 结构清晰
     *       2. 符合标准
     *       3. 易于理解
     *       4. 扩展方便
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println("id:"+id);
        return "success";
    }

    /**
     *RequestHeader注解
     *
     * 1. 作用：获取指定请求头的值
     * 2. 属性
     *    1. value：请求头的名称
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "host") String header){
        System.out.println("host:"+header);
        return "success";
    }

    /**
     * CookieValue注解
     *
     * 1. 作用：用于获取指定cookie的名称的值
     * 2. 属性
     *    1. value：cookie的名称
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("sessionId:"+cookieValue);
        return  "success";
    }

    /**
     * ModelAttribute注解
     *
     * 1. 作用
     *    1. 出现在方法上：表示当前方法会在控制器方法执行前线执行。
     *    2. 出现在参数上：获取指定的数据给参数赋值。
     * 2. 应用场景
     *    1. 当提交表单数据不是完整的实体数据时，保证没有提交的字段使用数据库原来的数据。
     * @return
     */
    @RequestMapping(value = "/testModelAttribute")
    public  String testModelAttribute(@ModelAttribute(name = "haha") User user){
        System.out.println("user:"+user);
        return "success";
    }

    /**
     * 这个方法先执行，不带返回值
     * @param name
     */
    @ModelAttribute
    public void showUser(String name, Map<String,User> map){
        User user = new User();
        user.setName(name);
        user.setAge(23);
        user.setBirthday(new Date());
        map.put("haha",user);
    }

    /**
     * 这个方法先执行，带返回值
     * @param name
     * @return
     */
/*    @ModelAttribute
    public User showUser(String name){
        User user = new User();
        user.setName(name);
        user.setAge(18);//如果表单有这个值，那么这个值就不生效
        user.setBirthday(new Date());
        System.out.println("show user");
        return user;
    }*/

    /**
     * SessionAttributes注解
     *
     * 1. 作用：用于多次执行控制器方法间的参数共享
     * 2. 属性
     *    1. value：指定存入属性的名称
     * @param model
     * @return
     */
    @RequestMapping("/setAttributes")
    public String setAttributes(Model model){
        //底层会存到request域对象中
        model.addAttribute("msg","哈哈");
        return "message";
    }

    /**
     * 获取session域对象中是值
     * @param modelMap
     * @return
     */
    @RequestMapping("/getAttribute")
    public String getAttribute(ModelMap modelMap){
        //从session域对象中获取值
        String msg = (String) modelMap.get("msg");
        System.out.println("msg:"+msg);
        return "message";
    }

    /**
     * 从session域对象中删除值
     * @param status
     * @return
     */
    @RequestMapping("/delAttribute")
    public String delAttribute(SessionStatus status){
        status.setComplete();//清除session域对象中所有的值
        return "message";
    }

}
