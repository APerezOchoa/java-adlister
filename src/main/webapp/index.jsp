<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Adlister</title>
</head>
<body>
    <%@ include file="partials/navbar.jsp" %>

    <h1>Welcome to Adlister</h1>
    <hr />
    <%! int counter = 0; %>
    <% counter += 1; %>
    <%= counter %>
    <%-- Comments --%>
</body>
</html>
