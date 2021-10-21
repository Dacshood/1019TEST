package com.yedam.test;

public class Test {

	public static void main(String[] args) {
		// 문제1) 
	      System.out.println("☆★☆★<문제1>☆★☆★");
	      int x = 37;
	      int y = 91;
	      
	      System.out.println("int x: " + x + ", int y: " + y);

	// 문제2)      
	      int z = y+x;
	      int z1 = y-x;
	      int z2 = y*x;
	      int z3 = y/x;
	      
	      System.out.println("☆★☆★<문제2>☆★☆★");
	      System.out.println(y+" + "+x+" = "+z);
	      System.out.println(y+" - "+x+" = "+z1);
	      System.out.println(y+" * "+x+" = "+z2);
	      System.out.println(y+" / "+x+" = "+z3);
	      
	// 문제3) 
	      System.out.println("☆★☆★<문제3>☆★☆★");
	      short var1 = 128;
	      String var2 = "B";
	      int var3 = 44032;
	      long var4 = 100000000000L;
	      float var5 = 43.93106F;
	      float var6 = 301.3F;
	      System.out.printf("%d, short\n", var1);
	      System.out.printf("%s, String\n", var2);
	      System.out.printf("%d, int\n", var3);
	      System.out.printf("%d, long\n", var4);
	      System.out.printf("%2.5f, float\n", var5);
	      System.out.printf("%3.1f, float\n", var6);

	// 문제4)
	      System.out.println("☆★☆★<문제4>☆★☆★");
	      byte a = 35;
	      byte b = 25;
	      int c = 463;
	      long d = 1000L;
	      
	      long result1 = a+c+d;
	      System.out.println(result1);
	      int result2 = a + b + c;
	      System.out.println(result2);
	      double e = 45.31;
	      double result3 = c + d + e;
	      System.out.println(result3);
	      
	// 문제5)
	      System.out.println("☆★☆★<문제5>☆★☆★");
	      int intValue1 = 24;
	      int intValue2 = 3;
	      int intValue3 = 8;
	      double intValue4 = 10;
	      String strValue = "번지";
	      String charValue = String.valueOf("A");
	      
	      String FinalResult = charValue + (intValue1 + intValue2) + intValue3 + strValue + intValue4; 
	      System.out.println(FinalResult);
	      
	     
	// 문제6
	      System.out.println("☆★☆★<추가문제>☆★☆★");
	      int value = 485;
	      int value1 = value/10/10-value/10/10/10*10;
	      int value2 = value/10-value/10/10*10;
	      int value3 = value-value/10*10;
	      
	      System.out.println(value+" 일 경우 "+value1+" + "+value2+" + "+value3+" = "+(value1+value2+value3));

	//문제 6e
	      
	      int valuee = 486;
	      
	      int hundred = valuee /100 ;
	      int ten = (valuee - (hundred* 100)) / 10;
	      int one = (valuee - (hundred * 100)) / 10 -(ten*10);
	      
	      System.out.println(hundred+ten+one);
	      
	      
	      
	      
	}
	
}
