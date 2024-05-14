<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardView</title>
</head>
<body>
	<h3>boardView.jsp</h3>
	<ul>
		<li><a href="${cPath}/board/list">목록보기</a></li>
		<li><a href="${cPath}/board/writeFrm">등록하기</a></li>
	</ul>
</body>
</html>