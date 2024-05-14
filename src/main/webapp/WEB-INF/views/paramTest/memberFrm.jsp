<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cPath" value="<%=request.getContextPath() %>"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입 form</h3>
	<form action="${cPath}/paramTest/param4" name="memberFrm" id="memberFrm" method=get>
		<table border="1">
			<tbody>
				<tr>
					<th>id</th>
					<td><input type="text" name="id" id="id"/></td>
				</tr>
				<tr>
					<th>pwd</th>
					<td><input type="password" name="pwd" id="pwd"/></td>
				</tr>
				<tr>
					<th>name</th>
					<td><input type="text" name="name" id="name"/></td>
				</tr>
				<tr>
					<th>age</th>
					<td><input type="number" name="age" id="age" min="1" max="150"/></td>
				</tr>
				<tr>
					<th>취미</th>
					<td>
						<input type="checkbox" name="hobby" id="hobby0" value="study"/>공부
						<input type="checkbox" name="hobby" id="hobby1" value="sports"/>운동
						<input type="checkbox" name="hobby" id="hobby2" value="eating"/>요리
						<input type="checkbox" name="hobby" id="hobby3" value="game"/>게임
						<input type="checkbox" name="hobby" id="hobby4" value="sleep"/>잠자기
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="확인"/>
						<input type="reset" value="취소"/>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>