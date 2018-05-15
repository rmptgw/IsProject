<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사원 계정 상세보기</title>
</head>
<body>
	<form name="frm" method="post" action="emp_common_info_edit">
		<table align="center" border="1">
			<form>
			<tr>
				<td colspan="10">
			<tr>
				<td rowspan="10" colspan="2"><input type="image" src=""><br>
					<input type="button" value="파일 첨부"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>${emp.eid}</td>
				<td>작성일</td>
				<td colspan="4"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${emp.ename}</td>
				<td>부서</td>
				<td>${emp.edept}</td>
				<td>직책</td>
				<td>${emp.eclass}</td>
			</tr>
			<tr>
				<td>입사일</td>
				<td>${emp.joindate}</td>
				<td>퇴사일</td>
				<td>${emp.dropdate}</td>
				<td>등급</td>
				<td></td>
			</tr>
			<tr>
				<td>생년월일</td>
				<td>${emp.birth}</td>
				<td>성별</td>
				<td><select name=""></td>
				<td>결혼여부</td>
				<td><select name=""></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td>${emp.phone}</td>
				<td>이메일</td>
				<td colspan="4">${emp.email}</td>
			</tr>
			<tr>
				<td>우편번호</td>
				<td colspan="6"><input type="text"> <input
					type="button" value="우편번호 검색"></td>
			</tr>
			<tr>
				<td rowspan="2">주소</td>
				<td colspan="8"><input type="text"></td>
			</tr>
			<tr>
				<td colspan="8"><input type="text"></td>
			</tr>
			<tr>
				<td align="center">은&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;행</td>
				<td><select>
						<option></option>
						<option>신한은행</option>
						<option>우리은행</option>
						<option>KB국민은행</option>
						<option>KEB하나은행</option>
						<option>NH농협은행</option>
				</select></td>
				<td align="center">계좌번호</td>
				<td colspan="3"><input type="text" placeholder="번호만 입력해주세요"></td>
			</tr>
			</form>
			</td>
			</tr>
			<tr>
				<td colspan="10">
					<form>
			<tr>
				<td colspan="10"><b>학력</b></td>
			</tr>
			<tr>
				<th>학교</th>
				<th>학과</th>
				<th>입학일</th>
				<th>졸업일</th>
			</tr>
			<tr>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td colspan="4" align="right"><input type="button" value="등록"></td>
			</tr>
			</form>
			</td>
			</tr>
			<tr>
				<td colspan="10">
					<form>
			<tr>
				<td colspan="10"><b>경력</b></td>
			</tr>
			<tr>
				<th>회사명</th>
				<th colspan="3">기간</th>
				<th>직위</th>
				<th>담당업무</th>
			</tr>
			<tr>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td>-</td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td>-</td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td>-</td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td>-</td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td colspan="10" align="right"><input type="button" value="등록"></td>
			</tr>
			</form>
			</td>
			</tr>
			<tr>
				<td colspan="10">
					<form>
			<tr>
				<td colspan="10"><b>SKILL INVENTORY</b></td>
			</tr>
			<tr>
				<th rowspan="2">프로젝트명</th>
				<th rowspan="2" colspan="3">참여기간</th>
				<th rowspan="2">고객사</th>
				<th rowspan="2">근무회사</th>
				<th rowspan="2">역할</th>
				<th colspan="3">개발환경</th>
			</tr>
			<tr>
				<th>언어</th>
				<th>DBMS</th>
				<th>Tool/Framework</th>
			</tr>
			<tr>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td>-</td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td colspan="8" align="right"><input type="button" value="등록"></td>
			</tr>
			</form>
			</td>
			</tr>
			<tr>
				<td colspan="3"></td>
				<td colspan="4" align="center"><input type="button" value="닫기"></td>
				<td colspan="3"><input type="button" value="전체등록"> <input
					type="button" value="계정삭제" style="color: red;"> <input
					type="button" value="▲TOP"></td>
			</tr>
		</table>
	</form>
</body>
</html>