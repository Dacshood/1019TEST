package com.yedam.java.app.emp;

import java.util.List;

public interface EmpDAO {
	//전체조회
		List<Employees> selectAll();
		//단건조회
		Employees selectOne(int employeeId);
		//등록
		void insert(Employees emp);
		//수정 : employeeId
		void update(Employees emp);
		//삭제
		void delete(int employeeId);
}
