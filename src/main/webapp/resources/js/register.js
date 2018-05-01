function validate(){
	var username=$("#username").val();
	var email=$("#email").val();
	var password=$("#password").val();
	var re_password=$("#re-passsword").val();
	var check=true;
	if(username==null || username.length<5 || username.length>30){
		$("#username").css({"border-color":"red"});
		check=false;
	}
	else{
		$("#username").css({"border-color":"green"});
	}

	if(email==null || email.length<5 ){
		$("#email").css({"border-color":"red"});
		check=false;
	}
	else{
		$("#email").css({"border-color":"green"});
	}

	if(password==null || password.length<8 || password.length>30 ){
		$("#password").css({"border-color":"red"});
		check= false;
	}
	else{
		$("#password").css({"border-color":"green"});
	}

	if(re_password==null || re_password.length<8 || re_password.length>30  || password!=re_password){
		$("#re-passsword").css({"border-color":"red"});
		check= false;
	}
	else{
		$("#re-password").css({"border-color":"green"});
	}
	
	return check;
}