<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin List</title>
<link type="text/css" 
	rel="stylesheet" 
	href= "${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

	<div class="wrapper">
		<div class="header">
			<h3>Admins are below</h3>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<table>
				<tr>
					
					<th>Username</th>
					<th>Password</th>
					<th>Email</th>
					<th>Contact</th>
				</tr>
				<c:forEach var="temp" items="${admins }">
				<tr>
					<th>${temp.adname }</th>
					<th>${temp.adpass }</th>
					<th>${temp.email }</th>
					<th>${temp.contact }</th>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>