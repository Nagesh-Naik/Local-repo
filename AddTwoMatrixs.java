package com.kodnest.array;
import java.util.*;
public class AddTwoMatrixs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter array size :");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int arr[][]=new int[a][b];
		 System.out.println("enter array element: ");
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 arr[i][j]=sc.nextInt();
				 }
		 }
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				 }
			 System.out.println();
		 }
	}

}
