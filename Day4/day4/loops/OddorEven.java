//Write a program to check if a given number is even or Odd
package com.demo.day4.loops;
import java.util.*;
public class OddorEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("The given number is Even");
		}
		else {
			System.out.println("The given number is Odd");
		}

	}

}
