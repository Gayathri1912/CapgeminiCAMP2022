/* Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive. 
For example if the inputs are “Wipro” and 3, then the output should be “propropro”.*/
package com.demo.day5.strings;
import java.util.Scanner;
public class AStringLastNRepeat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter repetition value:");
		int a = sc.nextInt();
		int l = s.length();
		for(int i=0;i<a;i++) {
			System.out.print(s.substring(l-a,l));
		}

	}

}
