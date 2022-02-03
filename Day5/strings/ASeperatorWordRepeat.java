/* Given two strings, word and a separator, return a big string made of count occurrences of the word, 
 * separated by the separator string.
if the inputs are "Wipro","X" and 3 then the output is "WiproXWiproXWipro".*/
package com.demo.day5.strings;

import java.util.Scanner;

public class ASeperatorWordRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter second string: ");
		String s2 = sc.nextLine();
		System.out.println("Enter the seperator:");
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			System.out.print(s1+s2);
		}

	}

}
