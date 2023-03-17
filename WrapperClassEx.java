package javaprogram;

import java.util.Scanner;

// Autoboxing
public class WrapperClassEx {

	public static void main(String[] args) {
		/*
		//Convert int to Integer
		//Autoboxing:
		int a = 20;
		//Convert int to explicitly
		// Using static factory method
		Integer i1=Integer.valueOf(a);
		//autoboxing now compiler will write Integer.valueOf(a)internally
		
		Integer j1=a; 
		System.out.println(a+" "+i1+" "+j1);
		
		
		//Unboxing
		// using constructor
		Integer i = new Integer(3);
		//convert integer into int explicitly
		int a =i.intValue();//wrapper to primitive
		//unboxing compiler write a.intvalue()
		int j=a;
		System.out.println(i+" "+a+" "+j);
		
		
		//creating integer object
		Integer i = new Integer("155");
		//return hash value
		int hashvalue = i.hashCode();
		System.out.println("Hash value for object is: "+ hashvalue);
*/
		//create 
		System.out.println("Enter the ");
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		sc.close();
		//return hashcode
		int hashvalue = i.hashCode();

	}

}
