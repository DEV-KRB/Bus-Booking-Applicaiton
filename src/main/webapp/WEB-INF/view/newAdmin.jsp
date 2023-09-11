<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Admin</title>
</head>
<body>
	
<div id="container">
	<div id="content">
		<form:form action="saveAdmin" modelAttribute="admin" method="POST">
		<form:hidden path="a_id" />
			<table>
				<tbody>
					<tr>
						<td><label>Name: </label></td>
						<td><form:input path="adname" /></td>
					</tr>
					<tr>
						<td><label>Password: </label></td>
						<td><form:input path="adpass" /></td>
					</tr>
					<tr>
						<td><label>Email: </label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label>Contact: </label></td>
						<td><form:input path="contact" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Submit" class=submit /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</div>

</body>
</html>