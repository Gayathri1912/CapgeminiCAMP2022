/* Write a program to convert from upper case to lower case and vice versa of an alphabet
 *  and print the old character and new character as shown in example (Ex: a->A, M->m).*/
package com.demo.day4.loops;
import java.util.*;
public class UpperLowerCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		 char a=sc.next().charAt(0);
	        char b;
	        if(Character.isLowerCase(a))
	            b= Character.toUpperCase(a);
	        else
	            b= Character.toLowerCase(a);
	        System.out.println(a+"->"+b);	       
	}
}
