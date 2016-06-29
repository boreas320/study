<%--
  Created by IntelliJ IDEA.
  User: boreas
  Date: 16/6/30
  Time: 03:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="i">
    ${i}
</c:forEach>

<form action="/xss/save" method="post">
    <input type="text" name="content"/>
    <input type="submit" value="啊啊啊啊">
</form>
</body>
</html>
