/*Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string length will be at least 2.*/
package com.demo.day5.strings;
import java.util.Scanner;
public class ADelFirstLast {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println(s.substring(1,(s.length()-1)));

	}

}
