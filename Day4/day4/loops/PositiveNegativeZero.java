// Write a program to check if a given number is Positive, Negative, or Zero.
package com.demo.day4.loops;
import java.util.*;
public class PositiveNegativeZero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("The given number is Negative");
		}
		else if(n>0) {
			System.out.println("The given number is Positive");
		}
		else {
			System.out.println("The given number is Zero");
		}

	}

}
