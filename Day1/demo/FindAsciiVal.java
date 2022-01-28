//Java Program to Find ASCII Value of a character
package com.demo;
import java.util.*;
public class FindAsciiVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char a = sc.next().charAt(0);
        int n = (int)a;
        System.out.println("The ASCII value of given character is "+n);
	}

}
