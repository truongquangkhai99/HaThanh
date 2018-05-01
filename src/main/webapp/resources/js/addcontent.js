function validate(){
	var title=$("#title").val();
	var brief=$("#brief").val();
	var content=$("#content").val();
	var check=true;
	console.log(title);
	if( title.length<10 || title.length>2000 ){
		$("#title").css({"border-color":"red"});
		check=false;
	}
	else{
		$("#title").css({"border-color":"green"});
	}

	if( brief.length<10 || brief.length>2000 ){
		$("#brief").css({"border-color":"red"});
		check=false;
	}
	else{
		$("#brief").css({"border-color":"green"});
	}

	if( content.length<10 || content.length>2000 ){
		$("#content").css({"border-color":"red"});
		check=false;
	}
	else{
		$("#content").css({"border-color":"green"});
	}

	return check;
}