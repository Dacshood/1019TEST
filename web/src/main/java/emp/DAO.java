package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	Connection conn;
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
}
