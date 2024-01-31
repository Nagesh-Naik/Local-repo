package com.kodnest.array;

import java.util.Scanner;

public class DessendingOrder { 
			void bubbleSort(int arr[]) 
			{ 
				 
				for (int i = 0; i < arr.length ; i++) 
					for (int j = i+1; j < arr.length ; j++) 
						if (arr[i] >  arr[j]) { 
							// swap temp and arr[i] 
							int temp = arr[i]; 
							arr[i] = arr[j]; 
							arr[j] = temp; 
						} 
			} 

			// Prints the array 
			void printArray(int arr[]) 
			{  
				for (int i = 0; i <  arr.length; i++) 
					System.out.print(arr[i] + " "); 
				System.out.println(); 
			} 

			// Driver method to test above 
			public static void main(String args[]) 
			{ 
//				int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter array element :");
				int ele=sc.nextInt();
				int arr[]=new int[ele];
				for(int i=0; i<=arr.length-1; i++) {
					arr[i]=sc.nextInt();	
					}
				DessendingOrder ob = new DessendingOrder(); 
				ob.bubbleSort(arr); 
				System.out.println("Sorted array"); 
				ob.printArray(arr); 
			} 
		

	}


