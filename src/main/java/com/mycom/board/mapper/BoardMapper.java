package com.mycom.board.mapper;

import java.util.List;

import com.mycom.board.vo.BoardVO;

//기존의 BoardDAO interface 역할을 하는 인터페이스
//다만, 여기에서는 MyBatis와 연동
public interface BoardMapper {
	
	//목록보기
	public List<BoardVO> getList();
	
	//글보기
	public BoardVO getBoard(int no);

	//등록하기
	public void write(BoardVO boardVO);

	//수정하기
	public void update(BoardVO boardVO);
	
	//삭제하기
	public void delete(int no);
}
