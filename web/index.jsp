<%--
  Created by IntelliJ IDEA.
  User: DFBZ
  Date: 2019/8/21
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        div {
            text-align: center;
        }
    </style>
</head>
<body>
    <h2>用户注册</h2>
    <form action="register" method="post">
        用户名： <input type="text" name="name"><br/>
        性别: <input type="radio" name="gender" value="男" checked="checked"/>男
        <input type="radio" name="gender" value="女"/>女 <br/>
        城市： <select name="city">
            <option value="广州">广州</option>
            <option value="深圳">深圳</option>
            <option value="珠海">珠海</option>
        </select> <br/>
        爱好： <input type="checkbox" name="hobby" value="上网"/>上网
        <input type="checkbox" name="hobby" value="上学"/>上学
        <input type="checkbox" name="hobby" value="上车"/>上车
        <input type="checkbox" name="hobby" value="上吊"/>上吊 <br/>
        <input type="submit" value="注册"/>
    </form>


</body>
</html>
