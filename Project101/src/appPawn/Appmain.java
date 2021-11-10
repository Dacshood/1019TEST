package appPawn;

import java.util.Scanner;

import app.common.Frame;

public class Appmain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("===============================");
			System.out.println("=====1.전당포 2.시세조회 9.종료=====");
			System.out.println("================================");
			System.out.println("선택 >>");
			int selected = scanner.nextInt();

			Frame frame = null;
			if (selected == 1) {
				frame = new PawnFrame();
			} else if (selected == 2) {
				frame = new ProductFrame();
				
			}else if (selected == 3) {
				frame = new UserFrame();
				
			}  else if (selected == 9) {
				System.out.println("종료");
				break;
			}
			frame.run();
		}

	}

}
