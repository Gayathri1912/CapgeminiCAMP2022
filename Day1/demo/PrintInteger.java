//Java Program to Print an Integer (Entered by the User)
package com.demo;
import java.util.*;
public class PrintInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a= sc.nextInt();
        System.out.println("The given Integer is "+a);
	}

}
