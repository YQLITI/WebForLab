<%--
  Created by IntelliJ IDEA.
  User: yaque
  Date: 2019/12/11
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<html>
<body>
<h1>${message}</h1>
<form action="<%=basePath%>admin/loginDeal" name="userForm" method="post">
    账号：<input type="number" name="name"><br><br><br>
    密码：<input type="text" name="password"><br><br><br>
    <input type="submit" name="submit">
</form>
</body>
</html>
