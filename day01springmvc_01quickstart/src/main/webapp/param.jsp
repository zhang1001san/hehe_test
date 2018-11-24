<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/18
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
    <h3>请求参数绑定之基本数据类型和字符串类型绑定</h3>
    <form action="param/save1" method="post">
        账号:<input type="text" name="username"><br>
        金额:<input type="text" name="money"><br>
        <input type="submit" value="提交">
    </form>

    <h3>请求参数绑定之实体类型（JavaBean）绑定</h3>
    <form action="param/saveAccount" method="post">
        账号:<input type="text" name="username"><br>
        金额:<input type="text" name="money"><br>
        用户名:<input type="text" name="user.name"><br>
        年龄:<input type="text" name="user.age"><br>
        <input type="submit" value="提交">
    </form>

    <h3>请求参数绑定之集合数据类型（List、map集合等）绑定</h3>
    <form action="param/saveCollection" method="post">
        学生名字:<input type="text" name="name"><br>
        订单1名称:<input type="text" name="orderList[0].orderName"><br>
        订单1金额:<input type="text" name="orderList[0].money"> <br>
        订单2名称:<input type="text" name="orderList[1].orderName"><br>
        订单2金额:<input type="text" name="orderList[1].money"> <br>
        map订单3名称:<input type="text" name="orderMap['one'].orderName"><br>
        map订单3金额:<input type="text" name="orderMap['one'].money"><br>
        map订单4名称:<input type="text" name="orderMap['two'].orderName"><br>
        map订单4金额:<input type="text" name="orderMap['two'].money"><br>
        <input type="submit" value="提交">

    </form>

    <h3>字符串转换为日期类</h3>
    <form action="param/conventDate" method="post">
        <input type="text" name="birthday"><br>
        <input type="submit" value="提交">
    </form>

    <a href="param/servlet">获取原生的Servlet API</a>

</body>
</html>
