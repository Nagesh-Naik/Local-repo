package com.kodnest.exception;
public class Main {

	public static void main(String[] args) {
		System.out.println("1");
		metho1();	
		System.out.println("2");
	}

	static void metho1() {
		System.out.println("3");
		method2();
		System.out.println("4");
	}

	static void method2() {
		System.out.println("5");
		method3();
		System.out.println("6");
	}

	static void method3() {
		System.out.println("7");
		System.out.println(10/0);
		System.out.println("8");
	}

}
