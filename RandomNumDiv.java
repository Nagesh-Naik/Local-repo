package com.kodnest.exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 Random num= new Random();
		 int value ;
		 int res=0;
		 value=num.nextInt(10);
		 if(value==0) { 
			 value++;
		 }
//		 System.out.println(value);
	     try {	
	    	 System.out.println("Enter a number for perform divison with "+ value);
	    	 int div=sc.nextInt();
			 res=value / div;
		 }catch(InputMismatchException e) {
			 System.err.println("Enter Number only...!");
		 }catch(ArithmeticException e1) {
			 System.err.println("Enter Number Except 0...!"); 
		 }
	     System.out.println(res);
	}

}
