package com.mycom.app2.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycom.app2.vo.MemberVO;

@RequestMapping(value = "/mv")
@Controller //Bean객체 생성
public class ModelViewController {
	//서버 요청주소와 실제파일 주소가 같다면 void로 변경하고 return 안해도 됨
	@RequestMapping(value = "responseView")
	public String responseView() {
		System.out.println("responseView()요청메서드진입");
		return "mv/responseView";
	}
	
	@RequestMapping(value = "/mvtest1")
	public String mvtest1(Model model) {
		model.addAttribute("name", "홍GD");			//String 객체
		model.addAttribute("today", new Date());	//Date 객체
		model.addAttribute("isStudent", Boolean.TRUE);	//Boolean 객체
		System.out.println("mvtest1()요청메서드진입");
		return "mv/mvtest1";
	}
	//파라미터방법
	@RequestMapping(value = "/mvtest2")
	public ModelAndView mvtest2(ModelAndView mv) {
		System.out.println("mvtest2()요청메서드진입");
		
		mv.addObject("name", "홍GD");
		mv.addObject("today", new Date());
		mv.addObject("isStudent", Boolean.TRUE);
		
		//model.addAttribute("name", "홍GD");			//String 객체
		//model.addAttribute("today", new Date());	//Date 객체
		//model.addAttribute("isStudent", Boolean.TRUE);	//Boolean 객체
		
		mv.setViewName("mv/mvtest2");
		return mv;
	}
	//객체생성방법 -> View페이지명을 파라미터로 제시할 수 있음
	@RequestMapping(value = "/mvtest3")
	public ModelAndView mvtest3() {
		System.out.println("mvtest3()요청메서드진입");
		
		ModelAndView mv = new ModelAndView("mv/mvtest2"); 
		mv.addObject("name", "홍GD");
		mv.addObject("today", new Date());
		mv.addObject("isStudent", Boolean.TRUE);
		
		//model.addAttribute("name", "홍GD");			//String 객체
		//model.addAttribute("today", new Date());	//Date 객체
		//model.addAttribute("isStudent", Boolean.TRUE);	//Boolean 객체
		
		return mv;
	}
	
	//@ModelAttribute 방법
	@GetMapping(value = "/mvtest4")
	public String mvtest4(@ModelAttribute("name") String name) {
		System.out.println("mvtest4()요청메서드진입");
		System.out.println("파라미터 name="+name);
		return "mv/mvtest4";
	}

	//@ModelAttribute에서 VO객체를 활용한 방법
	@RequestMapping(value = "/mvtest5")
	public String mvtest5(@ModelAttribute("memberInfo") MemberVO memberVO) {
		System.out.println("mvtest5()요청메서드진입");
		System.out.println("파라미터 name="+memberVO);
		return "mv/mvtest5";
	}
	
	//로그인폼 보여줘 요청
	@GetMapping(value = "/login")
	public String login() {
		System.out.println("login폼 보여줘 요청메서드진입");
		return "mv/login";
	}
	
	/*
   RedirectAttributes : 리다이렉트용 모델   
   준비 > 요청메서드(RedirectAttributes 참조변수명)
   문법 > 참조변수명.addFlashAttribute(String 이름, Object 값)*/
	//로그인처리 요청
	//유저가 입력한 id와 비밀번호 data를 받아서
	//id와 비번이 일치하면 로그인성공페이지 보여줘
	//일치하지 않으면 실패페이지 보여줘
	@PostMapping("/login")
	public String login(@RequestParam("id") String id
						,@RequestParam("pwd") String pwd
						,RedirectAttributes redirAttr) {
		System.out.println("login 처리 요청메서드진입");
		System.out.println("파라미터 id = " + id);
		System.out.println("파라미터 pwd = " + pwd);
		
		if(id.equals(pwd)) { //로그인성공
			return "mv/login_ok.jsp";
		}else { //로그인실패
			System.out.println("로그인실패");
			redirAttr.addAttribute("attr", "addAttribute - 아이디와 비밀번호 불일치");
			redirAttr.addFlashAttribute("info", "addFlashAttribute - 아이디와 비밀번호 불일치");
			return "redirect:/mv/login";
		}	//mv/login요청주소로 담당컨트롤러의 요청메서드를 호출
	}
	
}
