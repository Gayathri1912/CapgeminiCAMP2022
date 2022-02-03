/*
 Given a string, return a new string made of n copies of the first 2 chars of the original string where n is the length of the string. 
 The string may be any length. If there are fewer than 2 chars, use whatever is there.
If input is "Wipro" then output should be "WiWiWiWiWi".*/
package com.demo.day5.strings;
import java.util.Scanner;
public class AStringNcopies {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String str = s.substring(0,2);
		for(int i=0;i<s.length();i++) {
			System.out.print(str);
		}

	}

}
