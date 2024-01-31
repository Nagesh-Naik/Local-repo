package com.kodnest.array;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee a[]=new Employee[5];
Scanner sc=new Scanner(System.in);

 for(int i=0; i<a.length; i++) {
	 a[i]=new Employee();
 }
 for(int i=0; i<a.length; i++) {
	 System.out.println("Enter the employee "+i+" name");
	 a[i].name=sc.nextLine() ;
	 }
 
 System.out.println("The employee are: ");
 for(int i=0; i<a.length; i++) {
	 System.out.println(a[i].name);
 }
	}

}
class Employee{
	String name;
}
