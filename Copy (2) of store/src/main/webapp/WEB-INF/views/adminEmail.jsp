<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin Email Page</title>
</head>
<body>
	<p>this is admin Email Page</p>
	<a href="/">Return To Admin Page</a>
	<table>
		<tr>
			<th>Email</th>
		</tr>
		<c:forEach items="${emails}" var="email">
			<tr>
				<th>ID</th>
				<td>${email.id}</td>
				<th>Електронна адреса</th>
				<td>${email.name}</td>
				<td>
					<a href="/admin/email/delete/${email.id}">Видалити</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<h4>Додати електронну адресу</h4>
	<form action="/admin/email/save" method="post">
		<table>
			<tr>
				<td><input name="name" placeholder="Додати електронну адресу"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Додати"></td>
			</tr>
		</table>
	</form>
</body>
</html>