package com.mycom.app2;
//test목적의 클래스 -> 실행 Run as -> Junit

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycom.app2.mapper.TestMapper;
import com.mycom.board.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TestMyBatis {

	@Autowired
	TestMapper testMapper;
	
	/*
	 @Test public void test() { 
		String strTime = testMapper.getTime();
		System.out.println(strTime); 
	 }
	 */
	/*
	@Test
	public void testGetBoard() {
		List<BoardVO> list = testMapper.getBoard();
		System.out.println(list.size());
		System.out.println(list.toString());
	}
	
	@Test
	public void testInsertBoard() {
		BoardVO boardVO = new BoardVO(0,"테스트작성자명","테스트용title","테스트용 content");
		testMapper.insertBoard(boardVO);
	}
	
	@Test
	public void testInsertBoard2() {
		testMapper.insertBoard2("테스트작성자명1");
	}
	
	@Test
	public void testInsertBoard3() {
		BoardVO boardVO = new BoardVO(0, "테스트작성자", null, null);
		testMapper.insertBoard3(boardVO);
	}
	
	@Test
	public void testUpdateBoard() {
		BoardVO boardVO = new BoardVO(0,"테스트작성자명","테스트용title","테스트용 content");
		testMapper.updateBoard(boardVO);
	}
	
	@Test
	public void testDeleteBoard() {
		int no=5;
		testMapper.deleteBoard(no);
	}
	
	@Test
	public void testDeleteWriter() {
		String writerName="작성자2";
		testMapper.deleteWriter(writerName);
	}
	*/
	
}
