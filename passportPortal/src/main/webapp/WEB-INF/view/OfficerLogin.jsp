<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passport Officer</title>
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

</head>
<body class="text-center">
	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<span class="navbar-brand  mb-0 h1">Passport Portal </span>
			<span><a href="/passportPortal">Home</a> </span>
		</div>
	</nav>
	<div class="container">
		<div class="jumbotron my-5 ">

			<form action="login" method="post">
			    <h1>Passport Officer</h1>
				<h2 class="h3 mb-3 font-weight-normal">Please Login</h2>
				<div class="form-group row">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Username</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="userid"
							name="username" required autocomplete="off">
					</div>
					<span id="user" class="text-danger"></span>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="password"
							name="password" required autocomplete="off">
					</div>
					<span id="pass" class="text-danger"></span>
				</div>
				<div class="form-group row">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-lg btn-primary">Login</button>
					</div>
				</div>
			</form>
			<%
			if (request.getAttribute("isAuthorized") != null && request.getAttribute("isAuthorized").equals("false")) {
			%>
			<p style="color: red; text-align: center; font-weight: bold;">Invalid
				credentials</p>
			<%
			request.setAttribute("isAuthorized", null);
			}
			%>
		</div>
	</div>
</body>
</html>