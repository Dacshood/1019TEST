package com.yedam.app;

import com.yedam.app.emp.EmpDAO;
import com.yedam.app.emp.EmpDAOImpl;

public class EmpMain {

	public static void main(String[] args) {
		
		EmpDAO dao = EmpDAOImpl.getInstance();
		
		dao.select1();
		System.out.println();
		dao.select2();
		System.out.println();
		dao.select3();
		System.out.println();
		dao.select4();
	}

}
