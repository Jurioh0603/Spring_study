package com.mycom.app2;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //스프링프레임워크에서 독립적으로 테스트환경을 가동
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //해당 파일을 스프링 설정파일로 적용
//@@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //해당 파일을 스프링 설정파일로 적용
public class JDBCHikari {
//	@BeforeClass //해당 클래스에서 단 한번 실행 -static
//	public static void loadTest() {
//		System.out.println("beforeClass");
//	}
		
//	@Before //각 테스트 코드를 실행하기 전에 우선실행
//	public void testCode00() {
//		System.out.println("before");
//	}

	//커넥션풀 확인
	@Autowired
	DataSource dataSource;
	//스프링jdbc확인
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Test
	public void test() {

		try {
			Connection conn = dataSource.getConnection();
			System.out.println("결과확인:" + conn);
			
			System.out.println("스프링jdbc결과확인:" + jdbcTemplate);
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Test
	  public void testAssertEquals() {
	    assertEquals("failure - strings are not equal", "helloWorld", "helloWorld");
	  }

}
