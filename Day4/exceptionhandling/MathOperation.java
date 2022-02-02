/*Write a class MathOperation which accepts integers from command line. 
 Create an array using these parameters. Loop through the array and obtain the sum and 
 average of all the elements. Display the result. Check for various exceptions that may arise
 like ArithmeticException, NumberFormatException, and so on. 
 For example: The class would be invoked as follows: C:>java MathOperation 1900, 4560, 0, 32500*/

package com.demo.day4.exceptionhandling;
import java.util.*;
public class MathOperation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = args.length;		
		for (int i = 0; i < n; i++)
			if (args[i].charAt(args[i].length() - 1) == ',') 
				args[i] = args[i].replace(",", "");
		int[] ar = new int[n];
		int sum = 0;
		double a = 0;	
		try {
			for (int i = 0; i < n; i++) {
				ar[i] = Integer.parseInt(args[i]);	
				sum += ar[i];
			}
			a = sum / n;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}	
		System.out.println("sum: " + sum);
		System.out.println("avg: " + a);
		

	}

}
