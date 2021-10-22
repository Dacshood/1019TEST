package example;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서 
		//       최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		//  1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 가격을 입력받을 수 있도록 구현하세요.
		// 3) 각 가격에 해당하는 제품명은 인덱스+1로 합니다. 
		//    예를 들어 배열[0] = 10000 이면 10,000원인 제품은 1번째 제품입니다.
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		boolean run = true;
		int productCount = 0;
		int[] money = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.상품수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			
			case 1 :
				System.out.println("상품수>");
				
				productCount = scanner.nextInt();
				money = new int[productCount] ;
				break;
			case 2 : 
				for(int i=0; i<money.length; i++) {
					System.out.println((i+1)+"번째 제품>");
					money[i]=scanner.nextInt();
				}
				break;
			case 3 : 
				for(int i = 0; i<money.length; i++) {
					System.out.println((i+1)+"번째 제품: "+ money[i]);
				}
				break;
			case 4 : 
				// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				int max1 = 0;
				int max = 0;
				int sum = 0;
				for(int moneyy: money) {
					if(moneyy>max) {
						max=moneyy;
					}
					sum+=moneyy;	
				}
				for(int i=0; i<money.length; i++) {
					if(max1<money[i]) {
						max1=money[i];
					}
				}
				System.out.println("최고 가격을 가지는 제품은["+max1+"]입니다.");
				System.out.println("최고 가격을 제외한 제품의 총합은 : " + (sum-max) );
				break;
			case 5 : 
				run = false;
			}
			
}
		System.out.println("프로그램종료");
}
}