package appPawn;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import app.common.Frame;
import app.pawnShop.Pawn;
import app.pawnShop.PawnShopDAO;
import app.pawnShop.PawnShopDAOImpl;
import app.product.Product;
import app.product.ProductViewDAO;
import app.product.ProductViewDAOImpl;
import app.users.User;
import app.users.UserDAO;
import app.users.UserDAOImpl;

public class PawnFrame implements Frame {
	// 필드
	Scanner scanner = new Scanner(System.in);
	PawnShopDAO dao = PawnShopDAOImpl.getInstance();
	UserDAO daouser = UserDAOImpl.getInstance();
	ProductViewDAO daoproduct = ProductViewDAOImpl.getInstance();
	// 생성자
	public PawnFrame() {
		// 기능 출력
		// 기능 선택
		// 해당 기능 호출

		Outter : while (true) {

			int logIn = logInUser();
			if (logIn == 1) {
				System.out.println("로그인 되었습니다");

				// 로그인 완료 기능 출력

				while (true) {

					functionPrint();
					int functionNo = functionSelect();

					if (functionNo == 1) { // 등록
						insert();
					} else if (functionNo == 2) { // 경매
						selectAll();
						auction();
					} else if (functionNo == 3) { // 전체 제품 조회
						selectAll();
					} else if (functionNo == 4) { // 제품 조회
						selectOne();
					} else if (functionNo == 5) { // 물건 빼기
						delete();
					} else if (functionNo == 9) { // 종료
						end();
						break Outter;
					} else {
						System.out.println("잘못 입력하셨습니다.");

					}

				}

			} else if (logIn == 0) {
				System.out.println("비밀번호가 일치하지 않습니다");
			} else if (logIn == -1) {
				System.out.println("없는 아이디 입니다");
				System.out.println();
				System.out.println("<다시 로그인 하실려면 '아무숫자'를 입력해주세요> \n<처음 창으로 다시 돌아가실려면 '0'을 입력하세요>");
				int input = scanner.nextInt();
				if (input == 0)
					break;
			}

		}

	}

	// 메소드
	
	// 기능 출력 메소드
	void functionPrint() {
		System.out.println("");
		System.out.println("====================================================");
		System.out.println("==1.등록 2.물품추첨 3.전체조회 4.제품조회 5.물건빼기 9.홈화면==");
		System.out.println("====================================================");
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

	int logInUser() {
		User user = inputUser();
		return daouser.logIn(user);
	}

	User inputUser() {
		User user = new User();
		System.out.println("아이디 >> ");
		user.setUserId(scanner.next());// sc.nextInt();
		System.out.println("비밀번호 >>");
		user.setPassword(scanner.next());
		return user;

	}

	// 제품 번호 입력
	int productId() {
		System.out.println("제품번호>>");
		return scanner.nextInt();
	}

	// 제품 명 입력
	String productName() {
		System.out.println("제품명>>");
		return scanner.next();
	}

	int newPrice() {
		System.out.println("가격제시");
		return scanner.nextInt();
	}

	// 등록여부
	boolean isOnTheList(int productId) {
		Pawn selectedPawn = dao.selectOne(productId);
		if (selectedPawn == null) {
			return false;
		} else {
			return true;
		}
	}

	// 비등록여부
	boolean isnotOnTheList(int productId) {
		Pawn selectedPawn = dao.selectOne(productId);
		if (selectedPawn != null) {
			return false;
		} else {
			return true;
		}
	}

	// 입고기능
	void insert() {
		
		Pawn pawn = new Pawn();
		
		System.out.println("제품번호>>");
		pawn.setProductId(scanner.nextInt());
		if (isOnTheList(pawn.getProductId())) {
			System.out.println("등록된 제품번호가 존재합니다.");
			return;
		}
		System.out.println("제품명 >>");
		pawn.setProductName(scanner.next());
		System.out.println("맡긴 날짜");
		pawn.setReceiveDate(Date.valueOf(scanner.next()));
		System.out.println("흥정할 가격");
		pawn.setPrice(scanner.nextInt());
		System.out.println("흥정중...");
		dao.insert(pawn);
//		-> 물건을 맡길때 흥정을 할 수 있습니다.
//		   -> 정가보다 가격이 낮으면 거래가 완료됩니다.
//		   -> 흥정가격이 정가보다 2배이상 높을시 쫓겨납니다.
		boolean run = true;
		while (run) {

			if (pawn.getProductName().equals("자전거")) {
				if (pawn.getPrice() >= 50000 && pawn.getPrice() < 100000) {
					System.out.println("주인) 어허 그건좀 너무 비싸구려.");
					dao.update(pawn);
					if (dao.select(pawn) < 50000) {
						System.out.println("주인 만족하며 거래에 응하였습니다.");
					} else {
						System.out.println("다른 전당포를 찾아보시게\n흥정이 결렬되었습니다.");
						dao.delete(pawn.getProductId());
						run = false;
					}
					break;
				} else if (pawn.getPrice() >= 100000) {
					System.out.println("전당포에서 쫓겨났습니다.");
					dao.delete(pawn.getProductId());
					run = false;
				} else {
					System.out.println("주인) 탁월한 선택이십니다.");
					System.out.println("주인이 흐뭇해하며 거래를 완료했습니다.");
				}
				break;
			} else if (pawn.getProductName().equals("시계")) {
				if (pawn.getPrice() >= 10000 && pawn.getPrice() < 20000) {
					System.out.println("주인) 어허 그건좀 너무 비싸구려.");
					dao.update(pawn);
					if (dao.select(pawn) < 10000) {
						System.out.println("주인 만족하며 거래에 응하였습니다.");
					} else {
						System.out.println("다른 전당포를 찾아보시게\n흥정이 결렬되었습니다.");
						dao.delete(pawn.getProductId());
						run = false;
					}
					break;
				} else if (pawn.getPrice() >= 20000) {
					System.out.println("전당포에서 쫓겨났습니다.");
					dao.delete(pawn.getProductId());
					run = false;
				} else {
					System.out.println("주인) 탁월한 선택이십니다.");
					System.out.println("주인이 흐뭇해하며 거래를 완료했습니다.");
				}
				break;
			} else if (pawn.getProductName().equals("목걸이")) {
				if (pawn.getPrice() >= 70000 && pawn.getPrice() < 140000) {
					System.out.println("주인) 어허 그건좀 너무 비싸구려.");
					dao.update(pawn);
					if (dao.select(pawn) < 70000) {
						System.out.println("주인 만족하며 거래에 응하였습니다.");
					} else {
						System.out.println("다른 전당포를 찾아보시게\n흥정이 결렬되었습니다.");
						dao.delete(pawn.getProductId());
						run = false;
					}
					break;
				} else if (pawn.getPrice() >= 140000) {
					System.out.println("전당포에서 쫓겨났습니다.");
					dao.delete(pawn.getProductId());
					run = false;
				} else {
					System.out.println("주인) 탁월한 선택이십니다.");
					System.out.println("주인이 흐뭇해하며 거래를 완료했습니다.");
				}
				break;
			} else if (pawn.getProductName().equals("반지")) {
				if (pawn.getPrice() >= 40000 && pawn.getPrice() < 80000) {
					System.out.println("주인) 어허 그건좀 너무 비싸구려.");
					dao.update(pawn);
					if (dao.select(pawn) < 40000) {
						System.out.println("주인 만족하며 거래에 응하였습니다.");
					} else {
						System.out.println("다른 전당포를 찾아보시게\n흥정이 결렬되었습니다.");
						dao.delete(pawn.getProductId());
						run = false;
					}
					break;
				} else if (pawn.getPrice() >= 80000) {
					System.out.println("전당포에서 쫓겨났습니다.");
					dao.delete(pawn.getProductId());
					run = false;
				} else {
					System.out.println("주인) 탁월한 선택이십니다.");
					System.out.println("주인이 흐뭇해하며 거래를 완료했습니다.");
				}
				break;
			} else if (pawn.getProductName().equals("팔찌")) {
				if (pawn.getPrice() >= 60000 && pawn.getPrice() < 120000) {
					System.out.println("주인) 어허 그건좀 너무 비싸구려.");
					dao.update(pawn);
					System.out.println(dao.select(pawn));
					if (dao.select(pawn) < 60000) {
						System.out.println("주인 만족하며 거래에 응하였습니다.");
					} else {
						System.out.println("다른 전당포를 찾아보시게\n흥정이 결렬되었습니다.");
						dao.delete(pawn.getProductId());
						run = false;
					}
					break;
				} else if (pawn.getPrice() >= 120000) {
					System.out.println("전당포에서 쫓겨났습니다.");
					dao.delete(pawn.getProductId());
					run = false;
				} else {
					System.out.println("주인) 탁월한 선택이십니다.");
					System.out.println("주인이 흐뭇해하며 거래를 완료했습니다.");
				}
				break;
			} else if (pawn.getProductName().equals("금이빨")) {
				if (pawn.getPrice() >= 30000 && pawn.getPrice() < 60000) {
					System.out.println("주인) 어허 그건좀 너무 비싸구려.");
					dao.update(pawn);
					if (dao.select(pawn) < 30000) {
						System.out.println("주인 만족하며 거래에 응하였습니다.");
					} else {
						System.out.println("다른 전당포를 찾아보시게\n흥정이 결렬되었습니다.");
						dao.delete(pawn.getProductId());
						run = false;
					}
					break;
				} else if (pawn.getPrice() >= 60000) {
					System.out.println("전당포에서 쫓겨났습니다.");
					dao.delete(pawn.getProductId());
					run = false;
				} else {
					System.out.println("주인) 탁월한 선택이십니다.");
					System.out.println("주인이 흐뭇해하며 거래를 완료했습니다.");
				}
				break;
			} else {
				System.out.println("저희 전당포에선 거래하지 않는 물품입니다. 물품시세를 조회하고 오세요");
				dao.delete(pawn.getProductId());
				run = false;
			}

		}

	}

	// 흥정값 입력 기능
	void update() {
		Pawn pawn = new Pawn();
		dao.update(pawn);
		System.out.println("새로운 값을 제시하였습니다.");
	}

	// 흥정실패 삭제기능
	void delete() {
		int selected = productId();
		int result = dao.delete(selected);
		System.out.println(result + "건이 삭제되었습니다.");
	}

	void selectOne() {
		int selected = productId();
		Pawn pawn = dao.selectOne(selected);
		System.out.println(pawn);
	}

	void selectAll() {
		List<Pawn> list = dao.selectAll();
		for (Pawn pawn : list) {
			System.out.println(pawn);
		}
	}

	void end() {
		System.out.println("홈화면으로 돌아갑니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	void auction() {
		Pawn pawn = new Pawn();
		System.out.println();
		System.out.println("추첨을 원하시면 0번, 원하지않는다면 아무 숫자를 입력해주세요");
		System.out.println("숫자 입력>>");
		int selected = scanner.nextInt();
		if (selected == 0) {

			boolean run = true;

			while (run) {
				System.out.println("추첨을 시작합니다.");
				int random = (int) (Math.random() * 30);
				pawn.setProductId(random);
				switch (random) {
				case 1:
					if (isnotOnTheList(pawn.getProductId())) {
						System.out.println("꽝입니다.");
						run = false;
						break;
					}
					System.out.println("1번 물품에 당첨되셨습니다.");
					dao.delete(random);
					run = false;
					break;
				case 2:
					if (isnotOnTheList(pawn.getProductId())) {
						System.out.println("꽝입니다.");
						run = false;
						break;
					}
					System.out.println("2번 물품에 당첨되셨습니다.");
					dao.delete(random);
					run = false;
					break;
				case 3:
					if (isnotOnTheList(pawn.getProductId())) {
						System.out.println("꽝입니다.");
						run = false;
						break;
					}
					System.out.println("3번 물품에 당첨되셨습니다.");
					dao.delete(random);
					run = false;
					break;
				case 4:
					if (isnotOnTheList(pawn.getProductId())) {
						System.out.println("꽝입니다.");
						run = false;
						break;
					}
					System.out.println("4번 물품에 당첨되셨습니다.");
					dao.delete(random);
					run = false;
					break;
				case 5:
					if (isnotOnTheList(pawn.getProductId())) {
						System.out.println("꽝입니다.");
						run = false;
						break;
					}
					System.out.println("5번 물품에 당첨되셨습니다.");
					dao.delete(random);
					run = false;
					break;
				case 6:
					if (isnotOnTheList(pawn.getProductId())) {
						System.out.println("꽝입니다.");
						run = false;
						break;
					}
					System.out.println("6번 물품에 당첨되셨습니다.");
					dao.delete(random);
					run = false;
					break;
				case 7:
					if (isnotOnTheList(pawn.getProductId())) {
						System.out.println("꽝입니다.");
						run = false;
						break;
					}
					System.out.println("7번 물품에 당첨되셨습니다.");
					dao.delete(random);
					run = false;
					break;
				case 8:
					if (isnotOnTheList(pawn.getProductId())) {
						System.out.println("꽝입니다.");
						run = false;
						break;
					}
					System.out.println("8번 물품에 당첨되셨습니다.");
					dao.delete(random);
					run = false;
					break;
				case 9:
					if (isnotOnTheList(pawn.getProductId())) {
						System.out.println("꽝입니다.");
						run = false;
						break;
					}
					System.out.println("9번 물품에 당첨되셨습니다.");
					dao.delete(random);
					run = false;
					break;
				default:
					System.out.println("꽝입니다.");
					run = false;
					break;
				}
			}
		}
	}
}
