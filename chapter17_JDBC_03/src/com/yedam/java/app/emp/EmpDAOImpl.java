package com.yedam.java.app.emp;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.app.common.DAO;

public class EmpDAOImpl extends DAO implements EmpDAO {
	// 싱글톤
	private static EmpDAO instance = new EmpDAOImpl();

	public static EmpDAO getInstance() {
		return instance;
	}

	@Override
	public List<Employees> selectAll() {
		// 전체조회
		List<Employees> list = new ArrayList<>();
		try {
			connect();

			stmt = conn.createStatement();
			String sql = "select * from employees order by employee_id";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

				list.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Employees selectOne(int employeeId) {
		// 단건조회
		Employees emp = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "select * from employees where employee_id =" + employeeId;
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	@Override
	public void insert(Employees emp) {
		// 등록
		try {
			connect();
			String sql = "insert into Employees" + " (employee_id, first_name, "
					+ "last_name, email, phone_number, hire_date, "
					+ "job_id, salary, commission_pct, manager_id, department_id)" + "values(?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhoneNumber());
			pstmt.setDate(6, emp.getHireDate());
			pstmt.setString(7, emp.getJobId());
			pstmt.setInt(8, emp.getSalary());
			pstmt.setDouble(9, emp.getCommissionPct());
			pstmt.setInt(10, emp.getManagerId());
			pstmt.setInt(11, emp.getDepartmentId());

			int result = pstmt.executeUpdate();
			System.out.println(result + "건 등록완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void update(Employees emp) {
		// 수정 employeeId

		try {
			connect();
			String sql = "update employees set last_name = ? where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getLastName());
			pstmt.setInt(2, emp.getEmployeeId());

			int result = pstmt.executeUpdate();
			System.out.println(result + "건 등록완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void delete(int employeeId) {
		// 삭제
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "delete from employees where employee_id =" + employeeId;
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "건 삭제완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

}
