<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cPath" value="<%=request.getContextPath() %>" />   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
	<h3>mvtest4.jsp - Model, View</h3>
	* Controller로 부터 넘겨받은 ModelAttribute를 이용하여 받은 값<br/>
	- name : ${name}<br/>
	- today : ${today}<br/>
	- isStudent : ${isStudent}<br/>
	
<hr/>
*Model
1. Model 객체(= ModelMap)
   jsp/servlet에서 request.setAttribute(String 이름, Object 값)과 유사
   준비 > 요청메서드 (Model 모델참조변수명)
   문법 > 모델참조변수명.addAttribute(String 이름, Object 값)
2. ModelAndView객체
   준비 > 요청메서드(ModelAndView 참조변수명) or ModelAndView mv = new ModelAndView()
   문법 > 모델참조변수명. setViewName("뷰페이지명")
3. @ModelAtrribute
   문법 > 요청메서드(@ModelAttribute 데이터타입 변수명)
--------------------------------------------
*Veiw
	
	
</pre>
	<ul>
		<li><a href="${cPath}/mv/mvtest1">mvtest1</a></li>
		<li><a href="${cPath}/mv/mvtest2"></a></li>
		<li><a href="${cPath}/mv/mvtest3"></a></li>
	</ul>
</body>
</html>