package com.yedam.app.emp;

import java.sql.SQLException;

import com.yedam.app.common.DAO;

public class EmpDAOImpl extends DAO implements EmpDAO {
	//싱글톤
	private static EmpDAO instance = new EmpDAOImpl();

	public static EmpDAO getInstance() {
		return instance;
	}

	@Override
	public Employees select1() {
		Employees emp = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "select employee_id,first_name,email,salary from employees where salary>5000 and salary<10000";
			rs = stmt.executeQuery(sql);
			System.out.println("== 급여가 5000에서 10000 사이인 사원 목록 ==");
			while (rs.next()) {
				emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				if(emp == null) {
					System.out.println("해당자료가 없습니디");	
					}else {
				System.out.println(emp);}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	@Override
	public Employees select2() {
		Employees emp = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "select max(salary) as max from employees where job_id = 'ST_CLERK'";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				emp = new Employees();
				emp.setSalary(rs.getInt("max"));
				if(emp == null) {
					System.out.println("해당자료가 없습니디");	
					}else {
				System.out.println("== 직책이 'ST_CLERK'인 사원 중 최고 연봉 : "+emp.getSalary());}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	@Override
	public Employees select3() {
		Employees emp = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "select AVG(salary) as avg from employees where TO_CHAR(HIRE_DATE, 'MM') = '05'";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				emp = new Employees();
				emp.setSalary(rs.getInt("avg"));
				if(emp == null) {
					System.out.println("해당자료가 없습니디");	
					}else {
				System.out.println("== 5월에 입사한 사원들의 평균 연봉 : "+emp.getSalary());}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	@Override
	public Employees select4() {
		Employees emp = null;
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "select employee_id, first_name, email, salary from employees where job_id='SA_REP' AND salary>10000";
			rs = stmt.executeQuery(sql);
			System.out.println("== 직책이 'SA_REP'이며 급여가 10000이상인 사원 목록 ==");
			while (rs.next()) {
				emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				if(emp == null) {
				System.out.println("해당자료가 없습니디");	
				}else {
				System.out.println(emp);}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}
	
	

}
