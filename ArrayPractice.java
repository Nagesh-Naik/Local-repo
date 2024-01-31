package com.kodnest.array;
import java.util.*;
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of class");
		int m=sc.nextInt();
		System.out.println("Enter total number of student :");
		int n=sc.nextInt();
		int[][]a=new int[m][n];
		System.out.println("Enter the "+m*n+" student number of marks");


		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				a[i][j]=sc.nextInt();

			}
		}
		System.out.println("The clone of B array students marks are " );
		
		int b[][]=a.clone();
				for(int i=0; i<=b.length-1; i++) {
			for(int j=0; j<=b[i].length-1; j++) {
				
System.out.print( b[i][j]+" ");
			}
			System.out.println();
		}


}}