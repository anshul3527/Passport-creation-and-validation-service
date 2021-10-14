<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.triconinfotech.passportPortal.dto.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passport Portal</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
.jumbotron {
	width: 700px;
	margin-left: 200px;
}
</style>
<style>

.jumbotron {
width: 800px;
margin-left: 180px;
}
</style>

</head>
<body class="text-center">
	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<span class="navbar-brand  mb-0 h1">Passport Portal</span>
			<span><a href="/passportPortal">Home</a> </span>
		</div>
	</nav>
	
	<div class="container">
	<h1>Passport Applications</h1>
	<c:if test="${applications.size() != 0}">
				<table class="table my-4">
					<thead class="table-dark">
						<tr>
							<td>Application Id</td>
							<td>First Name</td>
							<td>Last Name</td>
							<td>Email</td>
							<td>Date of Birth</td>
							<td>Nationality</td>
							<td>Validate/Reject</td>
						</tr>
					</thead>
					<tbody>
						<%
						List<User> users = (List<User>) request.getAttribute("applications");
						for (User obj : users) {
						%>
						<tr>
							<td><%=obj.getApplicationId()%></td>
							<td><%=obj.getFirstName()%></td>
							<td><%=obj.getLastName()%></td>
							<td><%=obj.getEmail()%></td>
							<td><%=obj.getDateOfBirth()%></td>
							<td><%=obj.getNationality()%></td>

							<td> <a href="validatePassport?id=<%=obj.getApplicationId()%>"
								class="btn btn-primary">Validate</a>
								<a href="rejectPassport?id=<%=obj.getNationality()%>"
								class="btn btn-danger my-2">Reject</a>
								</td>
						</tr>
						<%
						}
						%>
					</tbody>
				</table>
			</c:if>

			<c:if test="${users.size() == 0 }">
				<p style="color: red; text-align: center; font-weight: bold;">Sorry!
					No Employees Found.</p>
			</c:if>
	</div>
	
	
</body>
</html>