<%--
  Created by IntelliJ IDEA.
  User: phpusr
  Date: 08.04.12
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<a href="<c:url value="/index" />">
    <spring:message code="label.contacts" />
</a><br/>

<c:if test="${not empty param.error}">
    <font color="red"> <spring:message code="label.loginerror" />
        : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message} </font>
</c:if>
<form method="POST" action="<c:url value="/j_spring_security_check" />">
    <table>
        <tr>
            <td align="right"><spring:message code="label.login" /></td>
            <td><input type="text" name="j_username" /></td>
        </tr>
        <tr>
            <td align="right"><spring:message code="label.password" /></td>
            <td><input type="password" name="j_password" /></td>
        </tr>
        <tr>
            <td align="right"><spring:message code="label.remember" /></td>
            <td><input type="checkbox" name="_spring_security_remember_me" /></td>
        </tr>
        <tr>
            <td colspan="2" align="right"><input type="submit" value="Login" />
                <input type="reset" value="Reset" /></td>
        </tr>
    </table>
</form>
