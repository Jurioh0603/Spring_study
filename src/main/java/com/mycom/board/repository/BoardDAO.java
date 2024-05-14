package com.mycom.board.repository;

import java.util.List;

import com.mycom.board.vo.BoardVO;

public interface BoardDAO {

	//목록보기 요청
	public List<BoardVO> getList();

	public List<BoardVO> setWrite();
}
