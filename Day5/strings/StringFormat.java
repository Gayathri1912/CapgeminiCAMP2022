package com.demo.day5.strings;
import java.util.*;
public class StringFormat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name of Student: ");
		String name = sc.nextLine();
		System.out.println("Enter the Department of student:");
		String Department= sc.nextLine();
		String s1 = String.format("The name of the student is :"+name);
		String s2 = String.format("The Department of the Student is :"+Department);
	    System.out.println(s1);
	    System.out.println(s2);


	}

}
