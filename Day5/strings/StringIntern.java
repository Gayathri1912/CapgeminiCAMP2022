package com.demo.day5.strings;
import java.util.*;
public class StringIntern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String str = s.intern();
		System.out.println("the given string is "+str);

	}

}
