package com.mycom.board.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycom.board.vo.BoardVO;

//2번째 방법 servlet-context의 bean 객체 생성 대신 어노테이션 활용
//반드시 구현클래스에서 선언
@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{

	//root-context.xml에서 bean 등록해놓은 객체를 주입
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//목록보기 요청
	@Override
	public List<BoardVO> getList() {
		String sql = "select no,writerName, title, content from board order by no desc";
		//1. 드라이버로딩 -> 환경설정
		//2. Connection 얻기
		//이전방식 -> List<BoardVO> list = new ArrayList<BoardVO>();
		//spring 방식
		List<BoardVO> list  = jdbcTemplate.query(sql, new Object[]{}, new RowMapper<BoardVO>() {
			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardVO boardVO = new BoardVO();
				boardVO.setNo(rs.getInt("no"));
				boardVO.setWriterName(rs.getString("writerName"));
				boardVO.setTitle(rs.getString("title"));
				boardVO.setContent(rs.getString("content"));
				return boardVO;
			}
		});
		
		//3. 객체준비
		//4. 쿼리문실행
		//5. 객체반납
		
		
		return list;
	}
	
	//입력하기
	@Override
	public List<BoardVO> setWrite() {
		return null;
	}

	
}
