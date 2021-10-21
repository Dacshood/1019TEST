package com.yedam.java.ch0502;

public class ReferenceTypeExample {

	public static void main(String[] args) {
//		int[] scores = new int[3]; // | 0 | 0 | 0 |
		int[] scores = { 83, 90, 87 }; // | 83 | 90 | 87 |

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 :" + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 :" + avg);

		int[] scores1;
		scores1 = new int[] { 83, 90, 87 };

		for (int i = 0; i < 3; i++) {
			System.out.println("scores1[" + i + "]=" + scores1[i]);
		}

		int result = add(new int[] {83,90,87});
		
		System.out.println("=========================");
		int [] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1 ["+i+"]="+arr1[i]);
		}
		
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1 ["+i+"]="+arr1[i]);
		}
		
		System.out.println("=========================");
		String[] arr3 = new String[3];
		//String str = new String();
		for(int i=0; i<3; i++) {
			System.out.println("arr3 ["+i+"]="+arr3[i]);
		}
		
//		String str = "";
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3 ["+i+"]="+arr3[i]);
		}
		
		System.out.println("=========================");
		int [] scores3 = {83,90,87};
		
		int sum3 = 0;
		for(int i=0; i<scores3.length; i++)
			sum3 += scores3[i];
		
		double avg3 = (double)sum3 / scores3.length;
		System.out.println("총합 :"+sum3);
		System.out.println("평균 :"+avg3);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	
}
