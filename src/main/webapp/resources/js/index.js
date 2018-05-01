$(document).ready(function(){
	$(".menu-view").click(function(){
		$(".content").html("<h4 class='mt-3 ml-3'>Loading</h4>")
		setTimeout(function(){
			 $.ajax({
			    url:"/JAVA_8118_JavaWeb_VietNB1/html/viewcontent.html",
			    type:'GET',
			    dataType:'text',
			    success: function(response){
			        $('.content').html(response);
			    }
			 });
		},1000);
	});

	$(".user-profile").click(function(){
		$.ajax({
			   url:"update-member",
			   type:'GET',
			   dataType:'text',
			   success: function(response){
			       $('.content').html(response);
			   }
			});
	});

});