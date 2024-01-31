package com.kodnest.exception;

import java.util.Scanner;



public class CustomException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int amount =sc.nextInt();
		try {
			withdraw(amount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	static void withdraw(int amount)throws KodasException {
		int balance =100;
		if(amount > balance) {
			throw new KodasException();
		}
	}

}
class KodasException extends Exception{
	public KodasException() {
		super(" YOU DONT HAD THAT MUCH BALANCE...!");
	}
}
