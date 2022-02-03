/* Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, 
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
If the inputs are "Hello" and "World", then the output is "HWeolrllod".
*/
package com.demo.day5.strings;
import java.util.Scanner;
public class AStringZigZagMix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = sc.nextLine();
		String bigger = s1.length() > s2.length() ? s1 : s2;
		String smaller = s1.length() < s2.length() ? s1 : s2;
        int l1 = s1.length();
        int l2 = s2.length();
        String str = new String("");
        for (int i = 0; i < smaller.length(); i++) {
			 str = str+(s1.charAt(i))+(s2.charAt(i));
		}
		
		str.concat(bigger.substring(smaller.length(), bigger.length()));
		System.out.println(str);
	}
}
