<%--
  Created by IntelliJ IDEA.
  User: Primer
  Date: 2019/6/19
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/register.do" method="post">
    用户名：<input type="text" name="merName">
    停车位置：<input type="text" name="parkLocation">
    停车位总数：<input type="text" name="parkTotal">
    收费情况：<input type="text" name="charge">
    <input type="submit" value="提交">
</form>

</body>
</html>
