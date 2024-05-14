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
	<h3>login.jsp</h3>
	attr : ${attr}<br/>
	info : ${info}<br/>
	<form action="${cPath}/mv/login" name="loginFrm" id="loginFrm" method=post>
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