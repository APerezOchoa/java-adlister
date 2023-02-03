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

<%-- JSP Solution --%>
    <%
        if(request.getMethod().equalsIgnoreCase("post") && Objects.equals(request.getParameter("username"), "admin") && Objects.equals(request.getParameter("password"), "password")){
            String redirectUrl = "/profile.jsp";
            response.sendRedirect(redirectUrl);
        }
    %>

    <form action="login.jsp" method="post">
        <label for="username">Username:</label>
        <input type="text" placeholder="Username" name="username" id="username" required />
        <label for="password">Password:</label>
        <input type="password" placeholder="Password" name="password" id="password" required />
        <button type="submit">Log In</button>
    </form>
</body>
</html>
