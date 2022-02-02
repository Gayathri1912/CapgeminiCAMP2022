// Write a Java program to find if the given number is palindrome or not
package com.demo.day4.loops;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int num =a,n=0;
		while(a!=0) {
			int r=a%10;
			a=a/10;
			n=n*10+r;
		}
		if(num==n) {
			System.out.println(num+" is a Palindrome");
		}
		else {
			System.out.println(num+" is not a Plindrome");
		}
		
	}

}
