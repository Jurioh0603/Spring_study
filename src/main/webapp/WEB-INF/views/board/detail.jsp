<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 컨트롤러에서 아래와 같이 Model을 넘겨받았다 
		BoardVO boardVO = boardService.getBoard(no);
		model.addAttribute("boardVO",boardVO);
		--%>
	
		글번호:${boardVO.no}
		&nbsp;&nbsp;&nbsp;
		작성자:${boardVO.writerName}
		&nbsp;&nbsp;&nbsp;
		제목:${boardVO.title}
		&nbsp;&nbsp;&nbsp;
		내용:${boardVO.content}
		&nbsp;&nbsp;&nbsp;
		
	
		<a href="${cPath}/board/list">목록보기</a>
		<a href="${cPath}/board/updateFrm?no=${boardVO.no}">수정하기</a>
		<a href="${cPath}/board/delete?no=${boardVO.no}">삭제하기</a><br/>
</body>
</html>