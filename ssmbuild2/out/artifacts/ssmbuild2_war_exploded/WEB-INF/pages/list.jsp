<%--
  Created by IntelliJ IDEA.
  User: 23950
  Date: 2020/10/24
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询了所有账户信息</h3>
    <c:forEach items="${list}" var="account">
        ${account.id}---->${account.name}---->${account.money}
    </c:forEach>
</body>
</html>
