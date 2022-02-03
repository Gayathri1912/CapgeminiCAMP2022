package com.demo.day5.strings;
import java.util.*;
public class StringCompareTo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = sc.nextLine();
		if(s1.compareTo(s2)== 0) {
			System.out.println("The Given two strings are same");
		}
		else if(s1.compareTo(s2)>0) {
			System.out.println("The given two strings are not same and s1 is lexicographically greater than s2");
		}
		else {
			System.out.println("The given two strings are not same and S2 is lexicographically greater than s1");
		}
	}
}
