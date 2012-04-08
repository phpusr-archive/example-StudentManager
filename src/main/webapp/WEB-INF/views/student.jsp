<%@ page import="org.dyndns.phpusr.contactmanager.service.Constants" %>
<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title><spring:message code="label.title" /></title>
</head>
<body>

<a href="<c:url value="/logout" />">
    <spring:message code="label.logout" />
</a>

<h2><spring:message code="label.title" /></h2>

<form:form method="post" action="<%= Constants.MAP_ADD_STUDENT %>" commandName="student">

    <table>
        <tr>
            <td><form:label path="name">
                <spring:message code="label.firstname" />
            </form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="surname">
                <spring:message code="label.lastname" />
            </form:label></td>
            <td><form:input path="surname" /></td>
        </tr>
        <tr>
            <td><form:label path="studGroup">
                <spring:message code="label.email" />
            </form:label></td>
            <td><form:input path="studGroup" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit"
                                   value="<spring:message code="label.addcontact"/>" /></td>
        </tr>
    </table>
</form:form>

<h3><spring:message code="label.contacts" /></h3>
<c:if test="${!empty studentList}">
    <table class="data">
        <tr>
            <th><spring:message code="label.firstname" /></th>
            <th><spring:message code="label.email" /></th>
            <th><spring:message code="label.telephone" /></th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${studentList}" var="student">
            <tr>
                <td>${student.name}</td>
                <td>${student.surname}</td>
                <td>${student.studGroup}</td>
                <td><a href="<%= Constants.MAP_DEL_STUDENT %>?<%= Constants.PARAM_DEL_STUDENT %>=${student.id}"><spring:message code="label.delete" /></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>