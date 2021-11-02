//package com.yedam.java.ch01;
//
//public class Example {
//	public static void main(String[] args) {
////		//NullPointerException
//		String data = null;
////		System.out.println(data.toString());
//		System.out.println();
//		
//		//ArrayIndexOutOfBoundException
////		String data1 = args[0];
////		String data2 = args[1];
////		
////		System.out.println("arg[0] : "+ data1);
////		System.out.println("arg[1]"+ data2);
//		if(args.length ==2) {
//			String data1 = args[0];
//			String data2 = args[1];
//			
//			System.out.println("arg[0] : "+ data1);
//			System.out.println("arg[1] : "+ data2);
//		}else {
//			System.out.println("두 개의 매개값이 필요합니다.");
//		}
//		
//		//Number FomatException
//		String data1 = "100";
//		String data2 = "a100";
//		
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//				
//		int result = value1 + value2;	
//		System.out.println(result);
//				
//		//ClassCastException
//		Dog dog = new Dog();
//		change (dog);
//		Cat cat =  new cat()
//			change(Cat);
//		
//	}
//	public static void changedog(Animal animal) {
//		if(animal instance of Dog) {
//			dog dog = (Dog)animal
//		}
//	}
//}
//
//class Animal() {}
//
//
//class Dog extends Animal() {}
//class Cat extendsAnimel;