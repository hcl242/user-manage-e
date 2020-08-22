<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${hello }
<c:forEach items="${userList }" var="user">
	<h2>${user.uid }--${user.uname }--${user.ubirthday }</h2>
</c:forEach>
</body>
</html>