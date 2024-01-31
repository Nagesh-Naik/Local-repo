package com.kodnest.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExHandle {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter Num-1");
		int a =	sc.nextInt();
		System.out.println("Enter Num-2");
		int b= sc.nextInt();	
		int c= a/ b;
		System.out.println(c);
	}catch(ArithmeticException | InputMismatchException   e) {
		System.out.println("Enter Number except zero");
	}catch(Exception e1) {
		System.out.println("Enter number for division operation");
	}
	}
	
}

