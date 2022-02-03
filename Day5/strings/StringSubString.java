package com.demo.day5.strings;

import java.util.Scanner;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println(s.substring(1,5));//returns va  
		System.out.println(s.substring(3));

	}

}
