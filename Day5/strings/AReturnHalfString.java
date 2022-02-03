/* Given a string of even length, return the first half. So the string "CatDog" yields "Cat".
 *  If the string length is odd number then return null.*/
package com.demo.day5.strings;
import java.util.Scanner;
public class AReturnHalfString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int n = s.length();
		if(n%2==0) {
			System.out.println(s.substring(0,n/2));
		}
		else {
			System.out.println("null");
		}

	}

}
