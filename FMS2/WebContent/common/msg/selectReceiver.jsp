<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수신자 검색</title>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>
					<input type="radio" name="receiverType" value="free" on>프리랜서
					<input type="radio" name="receiverType" value="emp" >사원
				</td>
			</tr>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>선택</th>
			</tr>
			<c:forEach var="receiver" items="${receiverList}">
				<tr>
					<td>${receiver.num}</td>
					<td>${receiver.name}</td>
					<td><input type="checkbox"></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>