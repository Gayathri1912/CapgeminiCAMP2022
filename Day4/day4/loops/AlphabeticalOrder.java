// Initialize two character variables in a program and display the characters in alphabetical order.
package com.demo.day4.loops;
import java.util.*;
public class AlphabeticalOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two characters: ");
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		if((int)a>(int)b) {
			System.out.println(b+","+a);
		}
		else {
			System.out.println(a+","+b);
		}

	}

}
