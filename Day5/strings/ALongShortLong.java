/*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and
 *  the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
 *  If input is "hi" and "hello", then output will be "hihellohi".*/
package com.demo.day5.strings;
import java.util.Scanner;
public class ALongShortLong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = sc.nextLine();
		String str = s1.concat(s2);
		if(s1.length()==0 || s2.length()==0) {
			System.out.println("One of the strings you entered is empty");
		}
		else if(s1.length()>s2.length()) {
			System.out.println(s2+s1+s2);
		}
		else if(s1.length()<s2.length()) {
			System.out.println(s1+s2+s1);
		}
	}

}
