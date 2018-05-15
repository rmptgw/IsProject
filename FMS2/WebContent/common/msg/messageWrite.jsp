<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메세지 작성</title>
</head>
<body>
	<form action="Eu?c=message_form" method="post" name="frm">
		<table name="messageWrite" border="1" align="center">
			<tr>
				<td colspan="6">
					신규 메세지 작성
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td colspan="5"><input type="text"></td>
			</tr>
			<tr>
				<td>발신자</td>
				<td><label/></td>
				<td>발신일</td>
				<td><label/></td>
				<td>수신자</td>
				<td>
					<input type="text">
					<input type="button" value="검색">
				</td>
			</tr>
			<tr>
				<td>관련프로젝트</td>
				<td colspan="5">
					<input type="text">
					<input type="button" value="검색">
				</td>
			</tr>
			<tr>
				<td colspan="6">
					<textarea rows="10" cols="50"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="6" align="right">
					<input type="button" value="보내기">
					<input type="button" value="취소">
				</td>
			</tr>			
		</table>
		
	</form>
</body>
</html>