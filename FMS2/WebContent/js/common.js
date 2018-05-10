function loginCheck() {
	if (document.frm.fid.value.length == 0) {
		alert("아이디를 써주세요");
		frm.emp_id.focus();
		return false;
	}
	if (document.frm.fpw.value == "") {
		alert("암호는 반드시 입력해야 합니다.");
		frm.emp_pass.focus();
		return false;
	}
	return true;
}

function idCheck() {
	if (document.frm.fid.value == "") {
		alert('아이디를 입력하여 주십시오.');
		document.formm.fid.focus();
		return;
	}
	var url = "idCheck.do?fid=" + document.frm.fid.value;
	window.open(url, "_blank_1",
					"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}

function idok(did) {
	opener.frm.fid.value = document.frm.fid.value;
	opener.frm.refid.value = document.frm.fid.value;
	self.close();
}

function joinCheck() {
	if (document.frm.emp_id.value.length == 0) {
		alert("아이디를 써주세요");
		frm.fid.focus();
		return false;
	} else if (document.frm.emp_id.value.length < 4) {
		alert("아이디는 4글자이상이어야 합니다.");
		frm.fid.focus();
		return false;
	} else if (document.frm.fpw.value == "") {
		alert("암호는 반드시 입력해야 합니다.");
		frm.fid.focus();
		return false;
	} else if (document.frm.fpw.value != document.frm.refpw_check.value) {
		alert("암호가 일치하지 않습니다.");
		frm.fpw.focus();
		return false;
	}
	/*else if (document.frm.reid.value.length == 0) {
		alert("중복 체크를 하지 않았습니다.");
		frm.emp_id.focus();
		return false;
	}*/
	return true;
}