/* Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are “Mark” and “Kate” 
then the ouput should be “markate”. (The output should be in lowercase)*/
package com.demo.day5.strings;

import java.util.Scanner;

public class AStringAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = sc.nextLine();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		String str;
		
		if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
			str = s1.concat(s2.substring(1, s2.length()));
		} else {
			str = s1.concat(s2);
		}
		
		System.out.println(str);		
	
		

	}

}
