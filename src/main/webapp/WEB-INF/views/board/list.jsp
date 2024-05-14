<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<h3>list.jsp</h3>
	list = ${list}
	<hr/>
	
	<c:forEach var="boardVO" items="${list}">
		${boardVO.no}
		&nbsp;&nbsp;&nbsp;
		${boardVO.writerName}
		&nbsp;&nbsp;&nbsp;
		<a href="${cPath}/board/detail?no=${boardVO.no}">${boardVO.title}</a>
		&nbsp;&nbsp;&nbsp;
	
		<a href="${cPath}/board/updateFrm?no=${boardVO.no}">수정하기</a>
		<a href="${cPath}/board/delete?no=${boardVO.no}">삭제하기</a><br/>
	</c:forEach>
	<%-- <ul>
		<li><a href="${cPath}/board/">수정하기</a></li>
		<li><a href="${cPath}/board/">삭제하기</a></li>
	</ul> --%>
</body>
</html>