package com.mycom.board.service;

import java.util.List;

import com.mycom.board.vo.BoardVO;

//서비스 계층 (service layer)
public interface BoardService {

	//목록보기 요청
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
