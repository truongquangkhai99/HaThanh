<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
</head>
<body>
<h4 class="mt-3">Edit Profile</h4>
<hr>
<div class="card">
  <div class="card-header bg-banner">
   Profile From Element
  </div>
  <div class="card-body">
    <form action="update-member" method="post" onsubmit="return false;">
      <div style="color: red;" class="error"></div>
	  <div class="form-group">
	    <label for="firstname">First Name</label>
	    <input type="text" class="form-control" id="firstname" placeholder="Enter the first name" name="firstname" value="${username.firstName }">
	  </div>
	  <div class="form-group">
	    <label for="lastname">Last Name</label>
	    <input type="text" class="form-control" id="lastname" placeholder="Enter the last name" name="lastname" value="${username.lastName }">
	  </div>
	  <div class="form-group">
	    <label for="email">Email</label>
	    <input type="text" class="form-control" id="email" placeholder="your_email@example.com" name="email" readonly="readonly" value="${username.email }">
	  </div>
	  <div class="form-group">
	    <label for="phone">Phone</label>
	    <input type="text" class="form-control" id="phone" placeholder="Enter your phone" name="phone" value="${username.phone }">
	  </div>
	  <div class="form-group">
	    <label for="description">Description</label>
	    <textarea name="description" rows="4" class="form-control" id="description">${username.description }</textarea>
	  </div>
	  <button type="submit" class="btn btn-outline-secondary" id="submit">Submit Button</button>
	  <button type="reset" class="btn btn-outline-secondary">Reset Button</button>
	</form>
  </div>
</div>
<script>
	$("#submit").click(function(){
		if(validateEditProfile()==true){
			var firstname=$("#firstname").val();
			var lastname=$("#lastname").val();
			var phone=$("#phone").val();
			var description=$("#description").val();
			$.ajax({
				   url:"update-member",
				   type:'POST',
				   data:{firstname:firstname,lastname:lastname,phone:phone,description:description},
				   dataType:'text',
				   success: function(response){
					   if(response==1){
						   $(".error").html("");
						   alert("update success")
					   }else if(response==-1){
						   $(".error").html("");
						   alert("server error")
					   }else{
						   var obj=JSON.parse(response)
						   $(".error").html("");
						   if(obj.error_firstname!=null)  $(".error").append(obj.error_firstname+"<br>");
						   if(obj.error_lastname!=null)  $(".error").append(obj.error_lastname+"<br>");
						   if(obj.error_phone!=null)  $(".error").append(obj.error_phone+"<br>");
						   if(obj.error_description!=null)  $(".error").append(obj.error_description+"<br>");
					   }
				   }
				});
		}
	});
</script>
</body>
</html>