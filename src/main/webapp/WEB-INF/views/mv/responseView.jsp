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
*Model &view
1. Model 객체(= ModelMap)
   jsp/servlet에서 request.setAttribute(String 이름, Object 값)과 유사
   준비 > 요청메서드 (Model 모델참조변수명)
   문법 > 모델참조변수명.addAttribute(String 이름, Object 값)

2. ModelAndView객체
  - 파라미터로 선언하는 방법
   준비 > 요청메서드(ModelAndView 참조변수명) or ModelAndView mv = new ModelAndView()
   문법 > 모델참조변수명. setViewName("뷰페이지명")
  - 객체 생성하는 방법  
   준비 > ModelAndView mv = new ModelAndView();
   문법 > ModelAndView mv = new ModelAndView("뷰페이지명");

3. @ModelAtrribute
   문법 > 요청메서드(@ModelAttribute 데이터타입 변수명)

4. RedirectAttributes : 리다이렉트용 모델 
	- 세션에 값이 저장, 보안상 중요한 데이터에 적합, redirect를 사용하기 때문에 1회성데이터
   준비 > 요청메서드(RedirectAttributes 참조변수명)
   문법 > 참조변수명.addFlashAttribute(String 이름, Object 값)(addFlashAttribute 단점 : 한번 처리되면 또 처리 X)
   문법 > 참조변수명.addAttribute(String 이름, Object 값)(여러번 사용할 수 있지만 쿼리스트링으로 값의 결과가 들어가기 때문에 잘 사용되어지지 X)

* view
- 요청함수의 리턴유형에 따라 view지정
1. String 타입
	예)public String home() {
		  return "home";
	   }
	   
2. void 타입 (요청주소와 실제경로가 같을 경우)
	예)public void home() {
	   }
	   
3. ModelAndView
	예)public void home(ModelAndView mv) {
	      return mv.setViewName("home");
	   }
4. redirect용 view
- String타입 => 예) return "redirect:/뷰페이지명";
	예)public String home() {
		  return "redirect:/home";  -> /home으로 Controller로 요청을 보내준다.
	   }
---------------------------------------------
	
	
</pre>
	<h3>responseView.jsp - Model, View</h3>
	<ul>
		<li><a href="${cPath}/mv/mvtest1">Model객체이용</a></li>
		<li><a href="${cPath}/mv/mvtest2">ModelAndView객체</a></li>
		<li><a href="${cPath}/mv/mvtest3">ModelAndView객체</a></li>
		<li><a href="${cPath}/mv/mvtest4?name=홍gd">@ModelAtrribute</a></li>
		
		<li><a href="${cPath}/mv/login">로그인폼 보여줘</a></li>
	</ul>
	
	<br/>
	<h3>회원가입 form</h3>
	<form action="${cPath}/mv/mvtest5" name="memberFrm" id="memberFrm" method=get>
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