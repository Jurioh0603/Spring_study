<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cPath" value="<%=request.getContextPath() %>"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>writeFrm</title>
</head>
<body>
	<h3>writeFrm.jsp</h3>
	<form action="${cPath}/board/write" name="writeFrm" id="writeFrm" method=post>
		<table border="1">
			<tbody>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writerName" id="writerName"/></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" id="title"/></td>
				</tr>
				<tr>
					<th>글내용</th>
					<td><textarea name="content" id="content" rows="5"></textarea></td>
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