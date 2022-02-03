package com.demo.day5.strings;
import java.util.*;
public class StringCharAt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("enter the index where the character to be found: ");
		int a = sc.nextInt();
		System.out.println("The char at "+a+" index of the given string "+s+" is "+s.charAt(a));
	}

}
