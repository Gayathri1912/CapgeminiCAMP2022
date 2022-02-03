package com.demo.day5.strings;
import java.util.*;
public class StringReplace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("What character do you want to replace:");
		char c = sc.next().charAt(0);
		System.out.println("This character should be replaced by:");
		char a = sc.next().charAt(0);
		String str = s.replace(c, a);
		System.out.println(str);
	}

}
