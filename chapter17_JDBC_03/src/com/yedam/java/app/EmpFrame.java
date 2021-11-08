package com.yedam.java.app;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.yedam.java.app.common.Frame;
import com.yedam.java.app.emp.EmpDAO;
import com.yedam.java.app.emp.EmpDAOImpl;
import com.yedam.java.app.emp.Employees;

public class EmpFrame implements Frame{
	// 필드
	Scanner scanner = new Scanner(System.in);
	EmpDAO dao = EmpDAOImpl.getInstance();

	// 생성자
	public EmpFrame() {
		// 메뉴를 출력하고
		// 메뉴를 선택해서
		// 해당 기능을 호출
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 등록
				insertEmp();
			} else if (menuNo == 2) { // 수정
				updateEmp();
			} else if (menuNo == 3) { // 삭제
				deleteEmp();
			} else if (menuNo == 4) { // 단건조회
				selectOne();
			} else if (menuNo == 5) { // 전체조회
				selectAll();
			} else if (menuNo == 9) { // 종료
				end();
				break;
			}
		}
	}
	//메소드
	
		// 메뉴를 출력하는 메소드
		void menuPrint() {
			System.out.println("");
			System.out.println("================================================");
			System.out.println("==1.등록 2.수정 3.삭제 4.사원조회 5.사원전체조회 9.종료==");
			System.out.println("================================================");
			System.out.println("선택>>");
		}
		// 메뉴를 선택하는 메소드
		int menuSelect() {
			int menuNo = 0;
			try {
			menuNo = scanner.nextInt();
			}catch(Exception e) {
				System.out.println("없는 메뉴입니다.");
			}
			return menuNo;
		}
		
		// 공통된 기능 - 입력 메소드
			Employees inputAll() {
				Employees emp = new Employees();
				System.out.println("사번>>");
				emp.setEmployeeId(scanner.nextInt());
				System.out.println("이름>>");
				emp.setFirstName(scanner.next());
				System.out.println("성>>");
				emp.setLastName(scanner.next());
				System.out.println("이메일>>");
				emp.setEmail(scanner.next());
				System.out.println("전화번호>>");
				emp.setPhoneNumber(scanner.next());
				System.out.println("입사일>>");
				emp.setHireDate(Date.valueOf(scanner.next()));
				System.out.println("직급>>");
				emp.setJobId(scanner.next());
				System.out.println("연봉>>");
				emp.setSalary(scanner.nextInt());
				System.out.println("상여금>>");
				emp.setCommissionPct(scanner.nextDouble());
				System.out.println("상사>>");
				emp.setManagerId(scanner.nextInt());
				System.out.println("부서>>");
				emp.setDepartmentId(scanner.nextInt());
				
				return emp;
			}
			
			int inputEmpNo() {
				int empNo = 0;
				System.out.println("사원번호>>");
				empNo = scanner.nextInt();
				return empNo;
						
						
			}
			
		// 각 기능 마다 메소드
		// - 종료
		void end() {
			System.out.println("프로그램을 종료합니다.");
		}

		// - 전체조회
		void selectAll() {
			List<Employees> list = dao.selectAll();
			for(Employees emp : list) {
				System.out.println(emp);
			}
		}
		
		// - 단건조회
		void selectOne() {
			int empNo = inputEmpNo();
			Employees emp = dao.selectOne(empNo);
			if(emp==null) {
				System.out.println("해당 부서가 없습니다.");
			}else {
				System.out.println(emp);
			}
		}
		
		// - 입력
		void insertEmp() {
			Employees emp = inputAll();
			dao.insert(emp);
		}
		
		// - 수정
		void updateEmp() {
			Employees emp = inputAll();
			dao.update(emp);
		}
		
		// - 삭제
		void deleteEmp() {
			int empNo = inputEmpNo();
			dao.delete(empNo);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	
}
