package com.mycom.app2;
//test목적의 클래스 -> 실행 Run as -> Junit

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycom.app2.mapper.TestMapper;

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
	//key값은 컬럼명, vlaue값은 해당 컬럼의 결과 내용
	/*
	@Test
	public void testGetBoard2() {
		HashMap<String, Object> map = testMapper.getBoard2(4);
		System.out.println(map.toString());
		System.out.println(map.get("NO"));//키로 값을 출력할 때 대문자 사용
		System.out.println(map.get("WRITERNAME"));//키로 값을 출력할 때 대문자 사용
	}*/
	/*
	@Test
	public void testGetBoard4() {
		int result = testMapper.selectTotalCnt();
		System.out.println(result);
	}
	*/
	/*
	@Test
	public void testGetBoard4() {
		ArrayList<HashMap<String,Object>> list = testMapper.selectBoard(5);
		System.out.println("글번호 1부터 no번까지"+list);
	}
	*/
}
