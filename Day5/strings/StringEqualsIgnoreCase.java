package com.demo.day5.strings;
import java.util.*;
public class StringEqualsIgnoreCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = sc.nextLine();
		if(s1.equalsIgnoreCase(s2)== true) {
			System.out.println("The Given two strings are same ignoring case");
		}
		
		else {
			System.out.println("The given two strings are not same");
		}
	}

}
