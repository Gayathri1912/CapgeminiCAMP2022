/*
 Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *
*/
package com.demo.day4.loops;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
