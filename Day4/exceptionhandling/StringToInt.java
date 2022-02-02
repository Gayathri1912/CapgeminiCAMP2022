/*Handle exception in number Problem statement: Get the input String from user and 
 * parse it to integer, if it is not a number it will throw number format exception Catch it and
 *  print "Entered input is not a valid format for an integer." 
 * or else print the square of that number. (Refer Sample Input and Output).*/

package com.demo.day4.exceptionhandling;
import java.util.*;
public class StringToInt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Enter a string :");
		try {
			int x = Integer.parseInt(s);
			System.out.println("The square value is: " + x * x);
			System.out.println("The work has been done successfully");
		} catch (NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}		
	}
}
