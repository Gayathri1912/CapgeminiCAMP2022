package com.demo.day4.loops;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		if(a==0 || a==1) {
			System.out.println(a+" is neither prime nor Composite");
		}
		else {
			int flag=0;
			for(int i =2; i<=a/2; i++) {
				if(a%i==0) {
					System.out.println(a+" is not a Prime Number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(a+" is a Prime number");
			}
		}
	}

}
