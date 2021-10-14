<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


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
	
	<div class="container my-3">
	<div class="jumbotron">
	<h1>Apply Here</h1>
	<form action="newApplication/submit" method="POST">
	 <div class="form-group row">
    <label for="firstName" class="col-sm-2 col-form-label">First Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="firstName" placeholder="First Name" name="firstName" required>
    </div>
  </div>
  <div class="form-group row">
    <label for="lastName" class="col-sm-2 col-form-label">Last Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="lastName" placeholder="Last Name" name="lastName" required>
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="inputEmail3" placeholder="Email" name="email" required>
    </div>
  </div>
  <div class="form-group row">
    <label for="dob" class="col-sm-2 col-form-label">Date of Birth</label>
    <div class="col-sm-10">
      <input type="date" class="form-control" id="dob" placeholder="Date Of Birth" name="dateOfBirth" required>
    </div>
  </div>
  <div class="form-group row">
					<label for="nation" class="col-sm-2 col-form-label">Nationality</label>
					 <select
						class="form-control"
						aria-label=".form-select-lg example" name="nationality" required>
						<option value="">None</option>
							<option value="Indian">Indian</option>
							<option value="Other">Other</option>
					</select>
				</div>
 
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </div>
</form>
</div>
	</div>
</body>
</html>