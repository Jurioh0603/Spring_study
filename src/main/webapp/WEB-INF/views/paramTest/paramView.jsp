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
	<h3>paramView.jsp</h3>
	<ul>
		<li><a href="${cPath}/paramTest/param1?id=hong&age=20">param1</a></li>
		<li><a href="${cPath}/paramTest/param2?id=kim&age=30">param2</a></li>
		<li><a href="${cPath}/paramTest/memberFrm">회원가입 form view 요청</a></li>
	</ul>
</body>
</html>