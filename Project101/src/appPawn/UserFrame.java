package appPawn;

import java.util.List;
import java.util.Scanner;

import app.common.Frame;
import app.users.User;
import app.users.UserDAO;
import app.users.UserDAOImpl;

public class UserFrame implements Frame {
	// 필드
	Scanner scanner = new Scanner(System.in);
	UserDAO dao = UserDAOImpl.getInstance();

	// 생성자
	public UserFrame() {
		// 기능 출력
		// 기능 선택
		// 해당 기능 호출

		while (true) {
			functionPrint();
			int functionNo = functionSelect();

			if (functionNo == 1) { // 회원가입
				insert();
			} else if (functionNo == 2) { // 회원정보 전체조회
				selectAll();
			} else if (functionNo == 3) { // 회원정보 이름을 통하여 검색
				selectOne();
			} else if (functionNo == 4) { // 회원정보 이름을 통하여 삭제
				delete();
			} else if (functionNo == 5) { // 회원정보 이름을 통하여 아이디,비밀번호 수정
				update();
			} else if (functionNo == 9) { // 종료
				end();
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");

			}
		}
	}

	// 메소드
	// 기능 출력 메소드
	void functionPrint() {
		System.out.println("");
		System.out.println("==================================================================");
		System.out.println("==1.회원가입 2.회원전체조회 3.회원검색 4.회원삭제 5.아이디,비밀번호 변경 9.종료==");
		System.out.println("==================================================================");
		System.out.println("선택>>");
	}

	// 기능 선택하는 메소드
	int functionSelect() {
		int functionNo = 0;
		try {
			functionNo = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		}
		return functionNo;
	}

	// 회원 이름 입력
	String name() {
		System.out.println("회원이름>>");
		return scanner.next();
	}
	// 회원가입
	void insert() {
		User user = new User();
		System.out.println("아이디 >>");
		user.setUserId(scanner.next());
		System.out.println("비밀번호 >>");
		user.setPassword(scanner.nextInt());
		System.out.println("이름 >>");
		user.setName(scanner.next());
		System.out.println("나이 >>");
		user.setAge(scanner.nextInt());
		dao.insert(user);
		
		System.out.println("회원가입이 완료되었습니다.");
	}

	//회원전체조회
	void selectAll() {
		List<User> list = dao.selectAll();
		for(User user : list) {
			System.out.println(user);
		}
	}
	//회원검색
	void selectOne() {
		String selected = name();
		User user = dao.selectOne(selected);
		System.out.println(user);
	}
	//회원삭제
	void delete() {
		String selected = name();
		dao.delete(selected);
		System.out.println("회원이 삭제 되었습니다.");
	}
	//아이디비밀번호변경
	void update() {
		String selected = name();
		dao.update(selected);
		System.out.println("회원 수정이 완료되었습니다.");
	}
	//종료
	void end() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
