<%--
  Created by IntelliJ IDEA.
  User: 23950
  Date: 2020/10/23
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>测试springmvc</title>
  </head>
  <body>
      <a href="/selectAll">测试select all</a>
      <h3>测试insert</h3>
  <form action="/addAccount" method="post">
    姓名：<input type="text" name="name"><br>
    金额：<input type="text" name="money"><br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
