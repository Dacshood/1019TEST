package app.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
	// Oracle 연결정보
	private String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	private String jdbc_url = "jdbc:oracle:thin:@192.168.0.35:1521:xe";
	private String connectedId = "hr";
	private String connectedPwd = "hr";

	// 각 메소드에서 공통적으로 사용하는 필드로 선언
	protected Connection conn = null;
	protected Statement stmt = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;

	// DB 연결
	public void connect() {
		try {
			// 1. JDBC Driver 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB 서버 접속하기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// DB 해제
	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
