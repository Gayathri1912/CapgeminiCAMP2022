/* Return a version of the given string, where for every star () in the string the star and the chars immediately to its 
 left and right are gone.So "ab*cd" yields "ad" and "ab*cd" also yields "ad".*/
package com.demo.day5.strings;

import java.util.Scanner;

public class AStarDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int n = s.indexOf('*');
		if(n>0) {
			System.out.println((s.substring(0,n-1))+(s.substring(n+2,s.length())));
		}
		else if(n==0) {
			System.out.println(s.substring(n+2,s.length()));
		}
		else if(n==s.length()) {
			System.out.println(s.substring(0,s.length()-1));
		}

	}

}
