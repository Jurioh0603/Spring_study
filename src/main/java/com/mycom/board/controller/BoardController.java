package com.mycom.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycom.board.service.BoardService;
import com.mycom.board.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	//이전 방식
	//private BoardService boardService = new BoardServiceImpl();
	
	//spring 방식
	//DI(의존성주입)
	@Autowired
	private BoardService boardService;
	
	
	
	//메인화면 요청
	@GetMapping(value = "/boardView")
	public String boardView() {
		return "board/boardView";
	}
	
	//목록보기 요청
	@GetMapping(value = "/list")
	public String boardList(Model model) {
		List<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
		return "board/list";
	}
	
	//등록화면 요청
	@GetMapping(value = "/writeFrm")
	public String boardWriteFrm() {
		return "board/writeFrm";
	}
	
	//상세보기 요청
	@GetMapping(value = "detail")
	public String boardDetail(@RequestParam("no") int no, Model model) {
		//목록보기에서 추가작업하고 -> 파라미터 받고 -> 모델작업 -> view 만들어서 출력
		//1.파라미터 받기(@RequestParam("no") int no)
		
		//2.비즈니스 로직
		//파라미터 int no : 상세조회하고 싶은 글번호 
		BoardVO boardVO = boardService.getBoard(no);
		
		//3.Model
		model.addAttribute("boardVO",boardVO);
		
		//4.View
		return "board/detail";
	}
	
	//등록하기
	@PostMapping("write")
	/*
	 * public String boardWrite(@RequestParam("writeName") String writeName
	 * 							,@RequestParam("title") String title 
	 * 							,@RequestParam("content") String content) {
	 */
		public String boardWrite(BoardVO boardVO) {
		System.out.println("boardWrite(BoardVO boardVO)"+boardVO);
		//1.파라미터 받기
		//2.비지니스로직
		boardService.write(boardVO);
		//3.Model
		//4.View
		return "/board/boardResult";
	}
	
	//수정폼 요청
	@GetMapping(value = "/updateFrm")
	public String boardUpdateFrm(@RequestParam("no") int no, Model model) {
		//특정글 상세정보를 가져오기
		BoardVO boardVO = boardService.getBoard(no);
		//모델로 처리
		model.addAttribute("boardVO",boardVO);
		System.out.println("수정폼 요청관련 특정 글 상세정보" + boardVO);
		//view로 넘기기
		return "board/updateFrm";
	}
	
	//수정처리하기
	@RequestMapping(value="update"
				   ,method = {RequestMethod.GET,RequestMethod.POST})
	public String boardUpdate(BoardVO boardVO) {
		boardService.update(boardVO);
		System.out.println("수정하기 boardUpdate() 진입");
		return "redirect:/board/list";//리다이렉트로 목록보기 요청-> 컨트롤러 -> 목록보기 페이지로 이동
	}
	
	//삭제하기
	@GetMapping("delete")
	public String boardDelete(@RequestParam("no") int no) {
		boardService.delete(no);
		return "/board/delete";
	}
}
