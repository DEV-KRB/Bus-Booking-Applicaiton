<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Home Page</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		<form:form>
			<a href="${pageContext.request.contextPath }/api/adminform">Admin</a>
			<a href="${pageContext.request.contextPath }/userpage/userform">User</a>
		</form:form>
		</div>
	</div>
</body>
</html>