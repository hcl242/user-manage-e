<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/login" method="post">
	用户名:<input type="text" name="uname">
	<input type="submit" value="登录">
</form>
</body>
</html>