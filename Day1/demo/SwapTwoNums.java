//Java Program to Swap Two Numbers
package com.demo;
import java.util.*;
public class SwapTwoNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the numbers to swap one by one :");
     int a = sc.nextInt();
     int b = sc.nextInt();
     int temp;
     temp=a;
     a=b;
     b=temp;
     System.out.println("After swapping the numbers are:");
     System.out.println(a);
     System.out.println(b);
	}

}
