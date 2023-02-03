<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2/2/23
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%--  NOTICE: in the form, the action of login is NOT login.jsp. It is directing the info to the login servlet where the logic will be handled. The .jsp files are to be used for intake of information, then it is to be sent off to the servlets for logic/course of action based on input --%>
    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" placeholder="Username" name="username" id="username" required />
        <label for="password">Password:</label>
        <input type="password" placeholder="Password" name="password" id="password" required />
        <button type="submit">Log In</button>
    </form>
</body>
</html>
