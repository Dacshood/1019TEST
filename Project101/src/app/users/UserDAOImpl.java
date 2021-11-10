package app.users;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.common.DAO;

public class UserDAOImpl extends DAO implements UserDAO {
	// 사용할 SQL 정리
	private final String SELECT_ALL = "select * from users order by user_id";
	private final String INSERT = "insert into users values(?,?,?,?)";
	private final String DELETE = "delete from users where name = ?";
	// 아이디와 비번 수정가능
	private final String UPDATE = "update users set user_password = ? where user_id = ?";

	Scanner scanner = new Scanner(System.in);
	// 싱글톤
	private static UserDAO instance = new UserDAOImpl();

	public static UserDAO getInstance() {
		return instance;
	}

	// 로그인
	public int login(User user) { 
			String sql = "select user_password from user where user_id = ?"; 
			try {
				connect();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user.getUserId());
				rs = pstmt.executeQuery();
				if (rs.next()) {
					if (rs.getString(1).contentEquals(user.getPassword())) {
						return 1;
					} else {
						return 0; // 비밀번호 불일치
					}
				}
				return -1; // 아이디가 없음
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
			return -2; // DB 오류
		}

	@Override
	public int insert(User user) {
		// 회원등록
		int result = 0;
		try {
			connect();

			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setInt(4, user.getAge());
			result = pstmt.executeUpdate();
			System.out.println("회원가입이 완료되었습니다.");
		} catch (SQLIntegrityConstraintViolationException e) {
			// 다중catch 로 무결성제약위반을 걸어서 id중복체크
			System.out.println("Id가 중복됩니다.");
		} catch (SQLException e) {
			System.out.println("잘못입력하셨습니다.");
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public void update(String userId) {
		User user = new User();
		try {
			connect();

			pstmt = conn.prepareStatement(UPDATE);
			System.out.println("새로운 비밀번호 입력");
			String newPassword = scanner.next();
			pstmt.setString(1, newPassword);
			pstmt.setString(2, userId);

			pstmt.executeUpdate();
			System.out.println("회원 수정이 완료되었습니다.");
		} catch (SQLException e) {
			System.out.println("수정이 되지않았습니다.");
		} finally {
			disconnect();
		}
	}

	@Override
	public int delete(String name) {
		int result = 0;
		try {
			connect();

			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, name);
			result = pstmt.executeUpdate();
			System.out.println("회원이 삭제 되었습니다.");
		} catch (SQLException e) {
			System.out.println("삭제가 되지않았습니다.");
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public List<User> selectAll() {
		List<User> list = new ArrayList<>();
		try {
			connect();

			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("user_id"));
				user.setPassword(rs.getString("user_password"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));

				list.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public User selectOne(String name) {
		User user = null;
		try {
			connect();

			stmt = conn.createStatement();
			String sql = "select * from users where name = '" + name + "'";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				user = new User();
				user.setUserId(rs.getString("user_id"));
				user.setPassword(rs.getString("user_password"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return user;
	}

	@Override
	public User selectcheck(int userId) {
		User user = null;
		try {
			connect();

			stmt = conn.createStatement();
			String sql = "select * from users where user_id = '" + userId + "'";
			rs = stmt.executeQuery(sql);
			if (rs == null) {
				System.out.println("중복되지않습니다.");
			} else {
				System.out.println("아이디가 중복됩니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public int logIn(User user) {
		
	      return 0;
	}

}
