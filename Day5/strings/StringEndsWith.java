package com.demo.day5.strings;
import java.util.*;
public class StringEndsWith {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter the string word to check if the given string lends with that");
		String c = sc.nextLine();
		boolean status = s.endsWith(c);
		if(status == true) {
			System.out.println("Yes..! The given String ends with "+c);
		}
		else {
			System.out.println("No..! The given String doesn't end with "+c);
		}
	}

}
