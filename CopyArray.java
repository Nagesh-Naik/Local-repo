package com.kodnest.array;

import java.util.Scanner;


public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int a=sc.nextInt();
		int arr[]= new int[a];
		System.out.println();
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
 int copp[]=new int[arr.length];
 for(int i=0; i<arr.length; i++) {
	 copp[i]=copp[i]+arr[i];
	 System.out.print(copp[i]+" ");
 }

	}
}
