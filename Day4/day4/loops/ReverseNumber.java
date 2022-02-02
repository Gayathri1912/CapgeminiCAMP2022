//Write a program to reverse a given number and print
package com.demo.day4.loops;
import java.util.*;
public class ReverseNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num =a,n=0;
		while(a!=0) {
			int r=a%10;
			a=a/10;
			n=n*10+r;
		}
		System.out.println(n);
		
	}

}
