package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.JDBC Driver 로딩하기.
		//Class라는 클래스는 객체를 가지고오는 역할을 함
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.DB 서버 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String password = "hr";
		
		Connection conn = DriverManager.getConnection(url, id, password); //통로 연결끝
		//3. Statement or PreparedStatement 객체 생성하기
		Statement stmt = conn.createStatement();
		
		//4. SQL 실행
		ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
		
		//5. 결과값 받아서 출력하기
		while(rs.next()) {
			String name = "이름 : " +rs.getString("First_Name");
			System.out.println(name);
		}
		//6. 자원 해체 하기
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
		

	}

}
