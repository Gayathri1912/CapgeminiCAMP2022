// Write a program to add all the values in a given number and print. Ex: 1234->10
package com.demo.day4.loops;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int num=n,sum=0;
		while(n!=0) {
			int r=n%10;
			sum += r;
			n= n/10;
		}
		System.out.println(num+"->"+sum);
	}
}