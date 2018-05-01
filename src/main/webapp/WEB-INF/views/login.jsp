<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
<link rel="stylesheet" href="resources/css/common.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>

</head>
<body>
<div class="row justify-content-center mt-5">
		<div class="col-4">
			<div class="card">
			  <div class="card-header bg-banner">
			   Please Sign In
			  </div>
			  <div class="card-body">
			    ${message }
			  	
			    <form action="login.html" method="post" > 
			      <form:errors path="member.*" element="ul" cssStyle="color:red;"></form:errors>
				  <div class="form-group">
				    <input type="email" class="form-control" id="email" placeholder="Email" name="email">
				  </div>
				  <div class="form-group">
				    <input type="password" class="form-control" id="password" placeholder="Password" name="password">
				  </div>
				  <div class="form-check">
				    <input type="checkbox" id="exampleCheck1">
				    <label class="form-check-label" for="exampleCheck1">Remember Me</label>
				  </div>
				  <button type="submit" class="btn btn-success btn-block">Login</button>
				</form>
				<p class="mt-3"><a href="register.html">click here to Register</a></p>
			  </div>
			</div>
		</div>
	</div>
	<script src="resources/js/login.js"></script>
</body>
</html>