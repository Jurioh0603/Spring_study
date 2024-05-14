package com.mycom.app2.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycom.app2.vo.MemberVO;

@Controller
@RequestMapping("/paramTest")
public class ParameterController {

	//요청메서드의 리턴유형이 void라면 
	//요청주소와 동일한 구조의 jsp 문서를 view로 지정해준다.(String Fraimework가)
	//=>여기에서는 요청주소("/paramTest/paramView")와
	//동일한 구조의 ("/paramTest/paramView.jsp")문서를 응답해준다.
	@GetMapping(value = "/paramView")
	public void paramView() { //void 라도 실행됨
		System.out.println("void paramView()요청함수진입");
		//return "/paramTest/paramView";
	}
	
	//기존방식
	@GetMapping("/param1")
	public String param1(HttpServletRequest request) {
		String id = request.getParameter("id");
		String strAge = request.getParameter("age");
		int age = 1;
		if(strAge != null) {
			age = Integer.parseInt(strAge) - 1;
		}
		System.out.println("파라미터id="+id);
		System.out.println("파라미터age="+strAge);
		System.out.println("만나이age="+age);
		System.out.println("void param1()요청함수진입");
		return "/paramTest/param1"; 
	}
	
	//어노테이션 활용한 방식(타입을 자유롭게 사용할 수 있다 int,String 등)
	@GetMapping("/param2")
	//문법 요청함수(@RequestParam("파라미터명") 데이터타입 변수) {
	public String param2(@RequestParam("id") String id, 
						 @RequestParam("age") int age) {
		System.out.println("파라미터id="+id);
		System.out.println("파라미터age="+age);
		System.out.println("만나이age="+(age-1));
		System.out.println("void param2()요청함수진입");
		return "/paramTest/param2"; 
		
	}
	
	@GetMapping("/memberFrm")
	public void memberFrm() {
		System.out.println("void memberFrm()요청함수진입");		
	}
	
	//요청방식 GET, POST 일 때 {안에 작성}
	@RequestMapping(value = "/param3", 
					method = {RequestMethod.POST,RequestMethod.GET})
	public String param3(@RequestParam("id")    String   id
						,@RequestParam("pwd")   String   pwd
						,@RequestParam("name")  String   name
						,@RequestParam("age")   int      age			//defaultValue = 기본값을 줘서 -> nullPointException을 방지(반드시 String 형태)
						,@RequestParam(value = "hobby", required = false, defaultValue = "없음") String[] hobby
						,@RequestParam(value = "hobby", required = false, defaultValue = "없음") ArrayList<String> hobby2) {
		System.out.println("void param3()요청함수진입"); //required = 필수항목이 아님을 required를 통해 지정해서 -> 400에러 방지 (true가 기본값) 
		System.out.println("파라미터id="+id);
		System.out.println("파라미터pwd="+pwd);
		System.out.println("파라미터name="+name);
		System.out.println("파라미터age="+age);
		System.out.println("파라미터 String[] hobby"+hobby);
		System.out.println("파라미터 String[] hobby2"+hobby2.toString()); //ArrayList주소
		
		for(String temp : hobby) { System.out.println(temp); }
	
		return "paramTest/param3";
	}
	
	//param3과 다르게 VO객체에 담아서 처리한 메서드 => 데이터 바인딩
	//주의 매개변수의 필드값에 데이터가 들어갈 수 있도록 한다.
	///만약 form의 값을 받는 형태라면 필수입력 유효성 검사를 거치도록 한다.
	@RequestMapping(value = "/param4", 
			method = {RequestMethod.POST,RequestMethod.GET})
	public String param4(MemberVO memberVO) {
		System.out.println("param4()요청함수진입"); 
		System.out.println("memberVO="+memberVO);
		return "paramTest/param4";
	}
	
	//특정 게시글 번호 가져올 때 활용할 수 있음
	//문법 (@PathVariable(주소변수) 데이터타입 매개변수명)
	//문법 (@PathVariable 데이터타입 매개변수명) (이때.주소변수명과 매개변수명이 같아함)
	@RequestMapping("/param5/{no}")
	public String param5(@PathVariable("no") String argNo) {
		System.out.println("void param5()요청함수진입"); 
		System.out.println("파라미터 argNo="+argNo); 
		return "paramTest/param5";
	}
	
	@RequestMapping("/param6/{no}")
	public String param6(@PathVariable String no) {
		System.out.println("void param6()요청함수진입"); 
		System.out.println("파라미터 no="+no); 
		return "paramTest/param6";
	}
	
	//파라미터가 한 개인 경우
	//기존 get 방식 url
	//1번 회원의 상세정보조회 get방식 컨페/paramTest/getNoticeBoard?bno=1
	//1번 회원의 상세정보조회 get방식 컨페/paramTest/getMember?mno=1
	
	//rest방식 url
	//1번 게시글 상세정보조회 get방식 	 컨페/paramTest/noticeBoard/1	
	//1번 회원의 상세정보조회 get방식 	 컨페/paramTest/member/1	
	//1번 회원의 정보수정 	  put방식 	 컨페/paramTest/member/1	
	//1번 회원의 정보삭제 	  DELETE방식 컨페/paramTest/member/1	
	
	//요청주소 컨텍스트패스/paramTest/param7/12 -> 12
	@RequestMapping("/param7/{no}")
	public String param7(@PathVariable String no) {
		System.out.println("void param7()요청함수진입"); 
		System.out.println("파라미터 no="+no); 
		return "paramTest/param7";
	}
	//파라미터가 한 개 이상인 경우
	//뉴스 카테고리의 1번글   get방식 컨페/paramTest/getNoticeBoard?category=news&bno=1
	//뉴스 카테고리의 1번글   get방식 컨페/paramTest/noticeBoard/news/1
	@RequestMapping("/noticeBoard/{category}/{no}")
	public String param8(@PathVariable("category") String category
						,@PathVariable("no") String no) {
		System.out.println("void param8()요청함수진입"); 
		System.out.println("파라미터 category="+category); 
		System.out.println("파라미터 no="+no); 
		return "paramTest/param8";
	}
	
}
