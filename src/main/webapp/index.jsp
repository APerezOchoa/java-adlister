<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to AdLister</title>
</head>
<body>
    <%--    <%@ include file="partials/navbar.jsp" %>--%>
    <jsp:include page="WEB-INF/partials/navbar.jsp" />

    <h1>Welcome to AdLister</h1>
    <hr />
    <%! int counter = 0; %>
    <% counter += 1; %>
    <%--    <%= counter %>--%>

    <% request.setAttribute("counter", counter); %>
    <%--    <p>${counter}</p>--%>
    <c:choose>
        <c:when test="${counter == 1}">
            <h1>You are the first visitor to this page!</h1>
        </c:when>
        <c:otherwise>
            <h1>You are viewer number: ${counter}</h1>
        </c:otherwise>
    </c:choose>
    <%-- Comments! --%>
    <%--    <h1>Howdy, <%= request.getParameter("name") %>!</h1>--%>
    <c:if test="${param.name != null}">
        <h1>Howdy, ${param.name}!</h1> <%-- another way of accessing the request parameter using expression language --%>
    </c:if>
    <% request.setAttribute("numbers", new int[]{1, 2, 3, 4, 5, 6, 7}); %>
    <ul>
        <c:forEach items="${numbers}" var="n">
            <li>${n}</li>
        </c:forEach>
    </ul>

</body>