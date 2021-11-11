package appPawn;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import app.common.Frame;
import app.product.Product;
import app.product.ProductViewDAO;
import app.product.ProductViewDAOImpl;

public class ProductFrame implements Frame {
	// 필드
	Scanner scanner = new Scanner(System.in);
	ProductViewDAO dao = ProductViewDAOImpl.getInstance();

	// 생성자
	public ProductFrame() {
		// 기능 출력
		// 기능 선택
		// 해당 기능 호출
		while (true) {
			functionPrint();
			int functionNo = functionSelect();

			if (functionNo == 1) { // 전체조회
				selectAll();
			} else if (functionNo == 2) { // 단건조회
				selectOne();
			} else if (functionNo == 3) { // 물건 등록(관리자)
				insert();
			} else if (functionNo == 4) { // 물건 수정(관리자)
				update();
			} else if (functionNo == 5) { // 물건 삭제(관리자)
				delete();
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
		System.out.println("========================================================");
		System.out.println("==1.전체조회 2.단건조회 3.시세등록 4.시세수정 5.시세삭제 9.홈화면==");
		System.out.println("========================================================");
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

	// 제품 번호 입력
	String productName() {
		System.out.println("제품명>>");
		return scanner.next();
	}

	// 등록여부
	boolean isOnTheList(String productName) {
		Product selectedProduct = dao.selectOne(productName);
		if (selectedProduct == null) {
			return false;
		} else {
			return true;
		}
	}

	// 전체 조회
	void selectAll() {
		List<Product> list = dao.selectAll();
		for (Product product : list) {
			System.out.println(product);
		}
	}

	// 단건 조회
	void selectOne() {
		String selected = productName();
		Product product = dao.selectOne(selected);
		System.out.println(product);
	}

	// 입고기능
	void insert() {
		Product product = new Product();
		System.out.println("제품명 >>");
		product.setProductName(scanner.next());
		if (isOnTheList(product.getProductName())) {
			System.out.println("등록된 제품명이 존재합니다.");
			return;
		}
		System.out.println("현재 시세 >>");
		product.setMarketPrice(scanner.nextInt());
		dao.insert(product);
	}

	// 가격수정
	void update() {
		String selected = productName();
		dao.update(selected);
		System.out.println("수정되었습니다.");
	}

	// 흥정실패 삭제기능
	void delete() {
		String selected = productName();
		dao.delete(selected);
		System.out.println("삭제되었습니다.");
	}
	void end() {
		System.out.println("홈화면으로 돌아갑니다.");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
