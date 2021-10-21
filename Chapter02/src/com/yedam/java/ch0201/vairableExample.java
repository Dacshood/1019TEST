package com.yedam.java.ch0201;

public class vairableExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour+"시간"+minute+"분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute +"분");
		

		int x, y, z;
		x=1;
		y=2;
		z = x+y;
		
		System.out.println(x+"+"+y+"="+z);
		
//	  정수형 변수 3개를 이용하여 정수값 54와 36을 연산해서 출력하는프로그램
		
		int a,b,c;
		a=54;
		b=36;
		
		c=a+b;
		System.out.println(a+"+"+b+"="+c);
		
		c=a-b;
		System.out.println(a+"-"+b+"="+c);
		
		c=a*b;
		System.out.println(a+"*"+b+"="+c);
		
		c=a/b;
		System.out.println(a+"/"+b+"="+c);
		
		int temp;
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("a:"+ a + ", b:" + b);
		System.out.println(temp);
		
		int v1 = 0;
		if(v1 >= 0) {
			v1 =1;
			int v2=0;
			if(v2 == 0) {
				v2 = 2;
				int v3 = v1 + v2;
				System.out.println("v1 : " + v1 + ", v2 : " + v2 + ", v3 : " +v3);
			}
			
		}
//		
		for(int i =0; i<10; i++) {
			int sum = i;
					sum= i + 1;
					System.out.println(sum);
		}
		
		int m = 10;
		
		int n=21;
		int sum = m+n;
		System.out.println("sum :"+ sum);
	
	
	
	
	
	}
	
}
