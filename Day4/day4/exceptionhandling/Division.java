/*Write a Program with a division method who receives two integer numbers and
 performs the division operation. The method should declare that it throws ArithmeticException.
  This exception should be handled in the main method.*/
package com.demo.day4.exceptionhandling;
import java.util.*;
public class Division {
	public static double division(int a, int b) throws ArithmeticException {
		return a / b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend and divisor:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			double r = division(a, b);
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
