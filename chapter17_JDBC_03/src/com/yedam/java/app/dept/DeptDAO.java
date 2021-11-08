package com.yedam.java.app.dept;

import java.util.List;

public interface DeptDAO {
	//전체조회
	List<Departments> selectAll();
	//단건조회
	Departments selectOne(int departmentId);
	//등록
	void insert(Departments dept);
	//수정 : departmentName
	void update(Departments dept);
	//삭제
	void delete(int departmentId);
}
