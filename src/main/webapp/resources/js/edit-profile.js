function validateEditProfile() {
	var firstname = $("#firstname").val();
	var lastname = $("#lastname").val();
	var phone = $("#phone").val();
	var description = $("#description").val();
	var check = true;
	if (firstname == null || firstname.length < 3 || firstname.length > 30) {
		$("#firstname").css({
			"border-color" : "red"
		});
		check = false;
	} else {
		$("#firstname").css({
			"border-color" : "green"
		});
	}

	if (lastname == null || lastname.length < 3 || lastname.length > 30) {
		$("#lastname").css({
			"border-color" : "red"
		});
		check = false;
	} else {
		$("#lastname").css({
			"border-color" : "green"
		});
	}

	if (phone == null || phone.length < 9 || phone.length > 13) {
		$("#phone").css({
			"border-color" : "red"
		});
		check = false;
	} else {
		$("#phone").css({
			"border-color" : "green"
		});
	}

	if (description.length < 13) {
		$("#description").css({
			"border-color" : "red"
		});
		check = false;
	} else {
		$("#description").css({
			"border-color" : "green"
		});
	}

	return check;
}