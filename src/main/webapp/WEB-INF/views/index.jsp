<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
<link rel="stylesheet" href="resources/css/common.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/index.js"></script>
<script src="resources/js/edit-profile.js"></script>
</head>
<body>
<div class="bg-banner border-bottom-banner" style="height: 60px;">  
	<h4 class="float-left pl-3 pt-1">CMS</h4>
	<div class="">
		<ul class="nav justify-content-end">
		  <li class="nav-item dropdown">
		    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false"><i class="fas fa-user"></i></a>
		    <div class="dropdown-menu dropdown-menu-right">
		      <a class="dropdown-item user-profile" href="#"><i class="fas fa-user"></i> User Profile</a>
		      <a class="dropdown-item" href="logout"><i class="fas fa-sign-out-alt"></i> Logout</a>
		    </div>
		  </li>
		</ul>
	</div>
</div>
<div class="row" style="margin: 0px;">
	<div class="col-lg-3  bg-banner" style="min-height: 580px; padding: 0px;">
		<div class="search ml-5 mt-2">
			<form class="form-inline">
			    <div class="input-group">
			      <input type="text" class="form-control" placeholder="Search">
			      <div class="input-group-prepend">
			        	<button class="btn"><i class="fas fa-search"></i></button>
			      </div>
			    </div>
			 </form>
		</div>
		<div class="list-group mt-3 ">
		  <a class="list-group-item menu-view" href="#"><i class="fas fa-table"></i> Views Contents</a>
		  <a class="list-group-item " id="addContent" href="#"><i class="fas fa-edit"></i> Form Content</a>
		</div>
	</div>
	<div class="col-lg-9 ">
		<div class="content">
			<h4 class="mt-3 ml-3">This is Content</h4>
		</div>
	</div>
</div>

<script>
	$("#addContent").click(function(){
		$.ajax({
			   url:"add-content.html",
			   type:'GET',
			   dataType:'text',
			   success: function(response){
				  $(".content").html(response);
			   }
			});
	});
</script>
</body>
</html>