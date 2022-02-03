/* Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
and otherwise return the string unchanged. If the input is "xHix", then output is "Hi".*/
package com.demo.day5.strings;

import java.util.Scanner;

public class ARemoveFirstLastX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int l = s.length();
		if((s.charAt(0)=='x' || s.charAt(0)=='X') && (s.charAt(l-1)=='x' || s.charAt(l-1)=='X')) {
			System.out.println(s.substring(1,l-1));
		}
		else if(s.charAt(0)=='x' || s.charAt(0)=='X') {
			System.out.println(s.substring(1,l));
		}
		else if(s.charAt(l-1)=='x' || s.charAt(l-1)=='X') {
			System.out.println(s.substring(0,l-1));
		}

	}

}
