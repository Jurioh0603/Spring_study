package com.mycom.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mycom.board.mapper.BoardMapper;
import com.mycom.board.repository.BoardDAO;
import com.mycom.board.vo.BoardVO;

//2번째 방법 servlet-context의 bean 객체 생성 대신 어노테이션 활용
//반드시 구현클래스에서 선언
@Service("boardService") //bean객체 생성시 사용되는 이름
public class BoardServiceImpl implements BoardService{
	//이전 방식
	//인터페이스 참조변수 = new 구현클래스생성자(); <= 다형성
	//private BoardDAO boardDAO = new BoardDAOImpl();
	
	//spring 방식
	//DI(의존성주입)
	//실행원리
	//타입(BoardDAO)을 보고 해당 타입을 가지고 있는 bean객체를 주입
	//@Autowired
	//어떤 곳에 bean을 넣을지 아래와 같이 명시해줄 수 있음
	//사용이유 : 같은 이름이 여러개일 때 대비
	//@Qualifier("boardDAO")
	//private BoardDAO boardDAO;
	
	//mybatis의 경우
	//DI(의존성주입)
	@Autowired
	private BoardMapper boardMapper;
	
	//목록보기 요청
	@Override
	public List<BoardVO> getList() {
		//필요시 추가작업
		//기존의 db연동
		List<BoardVO> list = boardMapper.getList();
		return list;
		
		//mybatis의 경우
	}

	//상세보기
	@Override
	public BoardVO getBoard(int no) {
		/* 2줄을 아래 한줄로 표현
		 * BoardVO boardVO = boardMapper.getBoard(no); 
		 * return boardVO;
		 */
		return boardMapper.getBoard(no);
	}


	//등록하기
	@Override
	public void write(BoardVO boardVO) {
		boardMapper.write(boardVO);
	}

	//수정하기
	@Override
	public void update(BoardVO boardVO) {
		boardMapper.update(boardVO);
	}
	
	
	
	//삭제하기
	@Override
	public void delete(int no) {
		boardMapper.delete(no);
	}

	
	
}
