<%-- 

	메시지 페이지
	
	작성자 : 

	수정일 : 
	
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메시지</title>
</head>
<body>
	<jsp:include page="/frame/header.jsp" />
	<c:set var="now" value="<%= new java.util.Date() %>" />
	<div>
		<form method="post" name="showMsgFrm" action="Eu?c=receive_message&no=${message.msgNum}">
			<table border="1" align="center">
				<tr>
					<td colspan="6">
						<h3>메시지 확인</h3>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<h3>
							${message.msgTitle}<input type="hidden" id="msgTitle" value="${message.msgTitle}">
						</h3>
						(<c:choose>
							<c:when test="${message.empWriter != null}">
								${message.empWriter}
								<input type="hidden" id="empWriter" value="${message.empWriter}">
							</c:when>
							<c:when test="${message.freeWriter != null}">
								${message.freeWriter}
								<input type="hidden" id="freeWriter" value="${message.freeWriter}">
							</c:when>
						</c:choose>
							, ${message.msgSendDate})
					</td>
				</tr>
				<tr>
					<th>발신자</th>
					<td>
						<c:choose>
							<c:when test="${message.empWriter != null}">
								<input type="text" id="freeReceiver" value="${message.empWriter}" readonly="readonly">
							</c:when>
							<c:when test="${message.freeWriter != null}">
								<input type="text" id="empReceiver" value="${message.freeWriter}" readonly="readonly">
							</c:when>
						</c:choose>
					</td>
					<th>발신일</th>
					<td>${message.msgSendDate}</td>
					<th>수신일</th>
					<td>${message.msgCheckedDate}</td>
				</tr>
				<tr>
					<th>관련 프로젝트</th>
					<td colspan="5">
						<input type="text" readonly="readonly" id="projNum" value="${message.projNum}">
					</td>
				</tr>
				<tr>
					<td colspan="6"><textarea rows="15" cols="50">${message.msgContent}</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="6" align="right">
						<input type="submit" value="답글쓰기">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<br>
	<br>
	<div>
		<form method="post" action="Eu?c=show_message">
		<table name="prevMassege" border="1" align="center">
			<tr>
				<td colspan="5">
					<h3>이전 메세지</h3>
				</td>
			</tr>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>발신자</td>
				<td>작성일<!-- 수신일 --></td>
				<td>메세지 확인 여부</td>
			</tr>
			<c:forEach var="message" items="${messageList}" varStatus="status">
				<tr class="record">
					<!-- 번호 -->
					<td>${status.count}</td>
					<!-- 제목 -->
					<td>
						<a href="Eu?c=show_message&no=${message.msgNum}">
							${message.msgTitle}
						</a>
					</td>
					<!-- 발신자 -->
					<td>
						<c:choose>
							<c:when test="${message.freeWriter == null}">
								${message.empWriter}
							</c:when>
							<c:when test="${message.empWriter == null}">
								${message.freeWriter}
							</c:when>
						</c:choose></td>
					<!-- 수신일 / 작성일 -->
					<td>${message.msgSendDate}</td>
					<!-- 메세지 확인 여부 -->
					<td>
						<c:choose>
							<c:when test="${message.msgChecked != false}">
								<label>미확인</label>
							</c:when>
							<c:otherwise>
								<label>확인</label>
							</c:otherwise>
						</c:choose>
					</td>
				</tr>
			</c:forEach>
		</table>
		</form>
	</div>
	<div>
		<form action="Eu?c=message" method="post" name="sendMsgFrm">
			<table border="1" align="center">
				<tr>
					<td colspan="6">메세지 작성</td>
				</tr>
				<tr>
					<td>제목</td>
					<td colspan="5">
						<input type="text" id="msgTitle" value="${reMsg.msgTitle}">
						<input type="hidden" id="prevMsgNum">
					
					</td>
				</tr>
				<tr>
					<td>발신자</td>
					<td>
						<c:choose>
							<c:when test="${loginemp == null}">
								<input type="text" id="freeWriter" value="${loginfree.freeName}"
									readonly="readonly">
							</c:when>
							<c:when test="${loginfree == null}">
								<input type="text" id="empWriter" value="${loginemp.empName}"
									readonly="readonly">
							</c:when>
						</c:choose></td>
					<td>발신일</td>
					<td><fmt:formatDate value="${now}" /></td>
					<td>수신자</td>
					<td>
					<input type="text" id="freeReceiver">
						<c:choose>
							<c:when test="${reMsg.freeReceiver != null}">
								<input type="text" id="receiver" value="${reMsg.freeReceiver}">
							</c:when>
							<c:when test="${reMsg.empReceiver != null}">
								<input type="text" id="receiver" value="${reMsg.empReceiver}">
							</c:when>
						</c:choose>
						<input type="hidden" id="freeReceiver" value="${reMsg.freeReceiver}">
						<input type="hidden" id="empReceiver" value="${reMsg.empReceiver}">
						<input type="button" value="검색" onclick="selectReceiver()">
					</td>
				</tr>
				<tr>
					<td>관련프로젝트</td>
					<td colspan="5">
						<input type="text" id="projNum" value="${reMsg.projNum}"> 
						<input type="button" value="검색" onclick="selectProject()">
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<textarea rows="10" cols="70" id="msgContent"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="6" align="right">
						<input type="submit" value="보내기">
						<input type="button" value="취소">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<jsp:include page="/frame/footer.jsp" />
</body>
</html>