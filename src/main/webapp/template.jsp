<%--
  Created by IntelliJ IDEA.
  User: phpusr
  Date: 08.04.12
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>Template</h1>
    <c:if test="${page == 'login'}">
        <%--<jsp:include page="login.jsp" />--%>
        <%@ include file="login.jsp" %>
    </c:if>

    <c:if test="${page != 'login'}">
        <jsp:include page="WEB-INF/views/${page}.jsp" />
        <%--<%@ include file="WEB-INF/views/${page}.jsp"%>--%>
    </c:if>
</body>
</html>