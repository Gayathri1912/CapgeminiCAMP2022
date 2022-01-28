//Java Program to Find the Largest Among Three Numbers
package com.demo;
import java.util.*;
public class FindLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter three numbers one by one :");
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     int c = sc.nextInt();
         if (a>b && a>c) {
        	 System.out.println("The largest number among the three numbers entered is "+a);
         }
         else if (b>a && b>c) {
        	 System.out.println("The largest number among the three numbers entered is "+b);
         }
         else {
        	 System.out.println("The largest number among the three numbers entered is "+c);
         }
	}

}
