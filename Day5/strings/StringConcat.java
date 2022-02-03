package com.demo.day5.strings;
import java.util.*;
public class StringConcat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = sc.nextLine();
		String str = s1.concat(s2);
		System.out.println("The final String after Concatination is "+str);
		
	}

}
