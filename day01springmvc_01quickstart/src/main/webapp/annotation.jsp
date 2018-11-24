<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/18
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用注解</title>
</head>
<body>
    <h3>1.RequestParam注解解决表单参数和控制器接收参数名称不一致问题</h3>
    <form action="annotation/requestParam" method="post">
        <input type="text" name="name"><br>
        <input type="submit" value="提交">
    </form>

    <h3>2.@RequestBody获取请求体</h3>
    <form action="annotation/testRequestBody" method="post">
        姓名:<input type="text" name="username"><br>
        年龄:<input type="text" name="age"><br>
        <input type="submit" value="提交">
    </form>

    <a href="annotation/testPathVariable/20">3.PathVariable</a><br>
    <a href="annotation/testRequestHeader">4.@RequestHeader获取请求头</a><br>
    <a href="annotation/testCookieValue">5.@CookieValue获取指定cookie名称的值</a><br>

    <h3>6.ModelAttribute</h3>
    <form action="annotation/testModelAttribute" method="post">
        姓名:<input type="text" name="name"><br>
        年龄:<input type="text" name="age"><br>
        <input type="submit" value="提交">
    </form>

    <h3>7.SessionAttributes注解:作用：用于多次执行控制器方法间的参数共享
    </h3>
    <a href="annotation/setAttributes">setAttributes</a><br>
    <a href="annotation/getApccttribute">getAttribute</a><br>
    <a href="annotation/delAttribute">delAttribute</a>

</body>
</html>
