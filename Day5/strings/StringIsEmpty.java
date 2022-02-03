package com.demo.day5.strings;
import java.util.*;
public class StringIsEmpty {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		boolean a = s.isEmpty();
		if(a==true) {
			System.out.println("You have enteredan empty String");
		}
		else {
			System.out.println("The String you entered is "+s);
		}
	}

}
