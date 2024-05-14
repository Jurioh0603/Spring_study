package com.mycom.app2;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {
	
	@Test
	public void test() {
		
		//데이터베이스 연결 확인
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String uid = "scott";
		String upw = "tiger";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, uid, upw);
			System.out.println("결과확인:" + conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
