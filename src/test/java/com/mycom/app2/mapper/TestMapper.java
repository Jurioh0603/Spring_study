package com.mycom.app2.mapper;

import java.util.List;

import com.mycom.board.vo.BoardVO;

//DAO역할을 하는 인터페이스
public interface TestMapper {

	public String getTime();//매개변수 x, 리턴type:String 
	public List<BoardVO> getBoard();//파라미터X, 리턴type:List<BoardVO>
	public void insertBoard(BoardVO boardVO);
	public void insertBoard2(String writerName);
	public void insertBoard3(BoardVO boardVO);
	public void updateBoard(BoardVO boardVO);
	public void deleteBoard(int no);
	public void deleteWriter(String writerName);
	
	
}
