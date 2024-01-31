package com.kodnest.array;

import java.util.Scanner;

public class ByteSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("user enter the size of the an array");
		Scanner sc= new Scanner(System.in);
		byte size=sc.nextByte();
		byte[] a=new byte[size];
		System.out.println("Enter "+size+" element");
		for(int i=0; i<=size-1; i++) {
			a[i]=sc.nextByte();
		}System.out.println("The elements are :");
		for(int i=0; i<=size-1; i++) {
			System.out.println(a[i]);
		}
	}

}
