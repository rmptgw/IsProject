<%-- 

	헤더
	
	작성자 : 

	수정일 : 
	
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
	<head>
		<link rel="stylesheet" href="../css/bootstrap.css">
	</head>
</html>
<div>
	로고
	<ul>
		<li><a href="">프로젝트 찾기</a></li>
		<li><a href="">프리랜서 찾기</a></li>
		<li><a href="">My페이지</a></li>
	</ul>
	<c:choose>
		<%--로그인 상태가 아니면 --%>
		<c:when test="${loginfree == null && loginemp == null}">
			<a href="Eu?c=login">로그인</a> / 
			<a href="Eu?c=join_form">회원가입</a>
		</c:when>
		<c:otherwise>
			<c:choose>
				<c:when test="${loginemp == null}">안녕하세요 ${loginfree.fName}</c:when>
				<c:otherwise>안녕하세요 ${loginemp.eName}</c:otherwise>
			</c:choose>
			<a href="">로그아웃</a>
		</c:otherwise>
	</c:choose>
</div>

<%-- 로그인 상태면 미니프로필 표시 --%>
<c:choose>
	<c:when test="${loginfree == null && loginemp == null}">
		<%-- 로그인상태 검사 --%>
		<%-- 로그인상태가 아니면 프로필 출력안됨 --%>
	</c:when>
	<c:otherwise>
		<%-- 로그인상태면 미니프로필 받아오면된다 --%>
		<jsp:include page="miniprof.jsp"></jsp:include>
	</c:otherwise>
</c:choose>