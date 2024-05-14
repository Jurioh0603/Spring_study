<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cPath" value="<%=request.getContextPath() %>"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글수정</title>
</head>
<body>
<%-- 컨트롤러로부터 특정글 상세정보를 Model로 받아와야한다 --%>
	<h3>updateFrm.jsp</h3>
	<form action="${cPath}/board/update" name="updateFrm" id="updateFrm" method=post>
		<table border="1">
			<tbody>
				<tr>
					<th>글번호</th>
					<td><span>번호출력예정</span>
						<input type="hidden" name="no" id="no" value="${boardVO.no}"/>
					</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writerName" id="writerName" value="${boardVO.writerName}"/></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" id="title" value="${boardVO.title}"/></td>
				</tr>
				<tr>
					<th>글내용</th>
					<td><textarea name="content" id="content" rows="5">${boardVO.content}</textarea></td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="submit" value="수정"/>
						<input type="reset" value="취소"/>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>