//Java Program to Compute Quotient and Remainder
package com.demo;
import java.util.*;
public class FindQuoAndRem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend :");
        int a= sc.nextInt();
        System.out.println("Enter divisor :");
        int b= sc.nextInt();
        System.out.println("the Quotient = "+(a/b));
        System.out.println("the Remainder = "+(a%b));
	}

}
