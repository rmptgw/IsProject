<%-- 

	회원가입 페이지
	
	작성자 : 

	수정일 : 
	
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/css/bootstrap.css">
<link rel="stylesheet" href="/js/common.js">
</head>
<body>
	<jsp:include page="/frame/header.jsp" />
	
	<div align="center">
		<form action="Eu?c=join" method="post" name="frm">
			<table border="1">
				<tr>회원가입</tr>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="fid"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>
						<input type="text" name="fid_front"> @ 
						<input type="text" name="fid_rear"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="fpw"></td>
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" name="refpw"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="checkbox" name="agree">
						이용약관 및 개인정보 이용방침에 동의합니다
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="가입완료" onclick="<!-- return joinCheck() -->">
						<input type="reset" value="다시입력" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<jsp:include page="/frame/footer.jsp"></jsp:include>
</body>
</html>