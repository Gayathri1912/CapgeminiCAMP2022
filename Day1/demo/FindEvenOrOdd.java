//Java Program to Check Whether a Number is Even or Odd
package com.demo;
import java.util.*;
public class FindEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a number :");
	     int a = sc.nextInt();
	     if(a%2==0) {
	    	 System.out.println("The Given number is Even");
	     }
	     else {
	    	 System.out.println("The Given number is Odd");
	     }
	}

}
