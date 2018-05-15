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
</head>
<body>
	<div>
		<table>
			<tr>
				<td><img src="/common/img/eureka.PNG" /></td>
				<c:choose>
					<%--로그인 상태가 아니면 --%>
					<c:when test="${loginfree == null && loginemp == null}">
						<td>	
							<a href="Eu?c=login">로그인</a> / 
							<a href="Eu?c=join_form">회원가입</a>
						</td>
					</c:when>
					<c:otherwise>
						<c:choose>
							<c:when test="${loginemp == null}">
								<td><a href="">프로젝트 관리</a></td>
								<td><a href="">프리랜서 관리</a></td>
								<td><a href="">계정 관리</a></td>
								<td>안녕하세요 ${loginfree.name}님</td>
								<td><a href="Eu?c=logout">로그아웃</a></td>
							</c:when>
							<c:otherwise>
								<td><a href="">프로젝트 찾기</a></td>
								<td><a href="">프리랜서 찾기</a></td>
								<td><a href="">My 페이지</a>></td>
								<td>안녕하세요 ${loginemp.eName}님</td>
								<td><a href="Eu?c=logout">로그아웃</a></td>
							</c:otherwise>
						</c:choose>
						
					</c:otherwise>
				</c:choose>
			</tr>
		</table>
	</div>
</body>
</html>
