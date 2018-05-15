<%-- 

	메시지 페이지
	
	작성자 : 

	수정일 : 
	
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메시지</title>
</head>
<body>
	<table name="newMessage" border="1" align="center">
		<tr>
			<td colspan="6">
				새로운&nbsp;메세지
			</td>
		</tr>
		<tr>
			<td colspan="6">
				메세지 제목
			</td>
		</tr>
		<tr>
			<td>발신자</td>
			<td>관리자 </td>
			<td>발신일</td>
			<td>2018.04.13 18:24:25</td>
			<td>수신일</td>
			<td>2018.04.13 20:15:54</td>
		</tr>
		<tr>
			<td>관련 프로젝트</td>
			<td colspan="5">제목</td>
		</tr>
		<tr>
			<td colspan="6">
				<label>nsdpangps</label>
			</td>
		</tr>
		
	</table>
	<br><br>
	<table name="prevMassege" border="1" align="center">
		<tr>
			<td colspan="5">
				이전 메세지
			</td>
		</tr>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>발신자</td>
			<td>작성일<!-- 수신일 --></td>
			<td>메세지 확인 여부</td>
		</tr>
		<c:forEach var="message" items="${prevMessage}">
				<tr class="record">
					<td>${message.mnum}</td><!-- 번호 -->
					<td>
						<a href="Eu?c=message_view&no=${message.no}">
							${message.title} </a>
					</td> <!-- 제목 -->
					<td>${message.writer1}</td><!-- 발신자 -->
					<td>${message.regdate}</td><!-- 수신일 / 작성일 -->
					<td>${message.checked}</td><!-- 메세지 확인 여부 -->
				</tr>
		</c:forEach>
	</table>
</body>
</html>