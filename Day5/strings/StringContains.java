package com.demo.day5.strings;
import java.util.*;
public class StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter a character sequence to check if it is there is the string:");
		String c = sc.nextLine();
		boolean status = s.contains(c);
		if(status == true) {
			System.out.println("the entered sequence is present in the given string");
		}
		else {
			System.out.println("the entered sequence is not present in the given string");
		}
	}

}
