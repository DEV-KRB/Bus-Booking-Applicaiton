<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Form</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
		<h2>Login Here or <a href="${pageContext.request.contextPath }/api/adminAddForm">Sign Up</a> if new</h2>
	</div>
</div>
<div id="container">
	<div id="content">
		<%-- <form:form action="" modelAttribute="admins" method="POST">
			<input type="text" name="email" value="email"/>
			<input type="password" name="password" value="password"/>
			<input type="submit" name="submit" value="submit" />
		</form:form> --%>
	</div>
</div>
</body>
</html>