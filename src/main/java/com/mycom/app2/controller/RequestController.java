package com.mycom.app2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//context:component-scan에 의해서 IoC 컨테이너가 Bean 객체로 생성
@Controller
@RequestMapping("/reqTest") //클래스 수준으로 @RequestMapping을 선언
// => 해당 클래스의 요청주소는 무조건 공통적인 주소로 시작해야 한다.
public class RequestController {
	//@RequestMapping("/req1") 메서드 수준으로 @RequestMapping을 선언
	@RequestMapping(value = "/req1") //브라우저에 입력하는 웹상 요청주소
	public String req1() {
		System.out.println("req1()호출");
		return "reqTest/req1"; //"/WEB-INF/views/" servlet-context에 지정된 경로에 이어서 작성
	}
	
	@RequestMapping(value = "/req2")
	public String req2() {
		System.out.println("req2()호출");
		return "reqTest/req2"; //"/WEB-INF/views/" servlet-context에 지정된 경로에 이어서 작성
	}			//물리적인 실제 주소
	
	//GET 방식 요청했을 때만 호출되는 요청메서드
	@RequestMapping(value = "/req3", method = RequestMethod.GET)
	public String req3() {
		System.out.println("req3()호출");
		return "reqTest/req3"; //"/WEB-INF/views/" servlet-context에 지정된 경로에 이어서 작성
	}
	
	//POST 방식 요청했을 때만 호출되는 요청메서드
	//Request method 'GET' not supported 405 에러발생
	@RequestMapping(value = "/req4", method = RequestMethod.POST)
	public String req4() {
		System.out.println("req4()호출");
		return "reqTest/req4"; //"/WEB-INF/views/" servlet-context에 지정된 경로에 이어서 작성
	}
	
	//GET 방식 요청했을 때만 호출되는 요청메서드
	//4.xx 버전부터 @GetMapping가능 -> pom.xml에서 5.xx로 변경
	@GetMapping(value = "/req5")
	public String req5() {
		System.out.println("req5()호출");
		return "reqTest/req5"; //"/WEB-INF/views/" servlet-context에 지정된 경로에 이어서 작성
	}
	
	@PostMapping(value = "/req6")
	public String req6() {
		System.out.println("req6()호출");
		return "reqTest/req6"; //"/WEB-INF/views/" servlet-context에 지정된 경로에 이어서 작성
	}
	
	//요청방식 GET, POST 일 때 {안에 작성}
	@RequestMapping(value = "/req7", method = {RequestMethod.POST,RequestMethod.GET})
	public String req7() {
		System.out.println("req7()요청함수진입");		
		return "paramTest/req7";
	}
}
