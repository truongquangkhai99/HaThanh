function validate(){
	var email=$("#email").val();
	var password=$("#password").val();
	var check=true;
	if(email==null || email.length<5 || email.length>50 ){
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
	return check;
}