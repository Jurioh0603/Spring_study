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
	<h3>req1.jsp 문서</h3>
	<ul>
		<li><a href="${cPath}/reqTest/req2">req2 호출</a></li>
		<li><a href="${cPath}/reqTest/req3">req3 호출</a></li>
		<li><a href="${cPath}/reqTest/req4">req4 호출</a></li>
		<li><a href="${cPath}/reqTest/req5">req5 호출</a></li>
		<li><a href="${cPath}/reqTest/req6">req6 호출</a></li>
	</ul>
</body>
</html>