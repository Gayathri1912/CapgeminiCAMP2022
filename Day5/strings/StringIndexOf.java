package com.demo.day5.strings;
import java.util.*;
public class StringIndexOf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter a char to find the index:");
		char c = sc.next().charAt(0);
		System.out.println("The index of "+c+ " in the given string is "+s.indexOf(c));
	}

}
