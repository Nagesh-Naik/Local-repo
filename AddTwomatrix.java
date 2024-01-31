package com.kodnest.array;

import java.util.Scanner;

public class AddTwomatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][]a = {{1,2},{4,5}};
//		int[][]b = {{4,7},{8,7}};
//		
//		int[][] c= new int[2][2];
//		for(int i=0; i<2; i++) {
//			for(int j=0;j<2; j++) {
//				c[i][j]=a[i][j]+b[i][j];
//				System.out.println("The sum of two matrix is :");
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of class");
		int m=sc.nextInt();
		System.out.println("Enter total number of student :");
		int n=sc.nextInt();
		int[][]a=new int[m][n];
		int[][] b= new int[m][n];
		System.out.println("Enter the "+ m*n+ " element 1");
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the "+ m*n+ " element 2");
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the "+ m*n+ " element");
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the "+ m*n+ " element");
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter the "+ m*n+ " element");
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
