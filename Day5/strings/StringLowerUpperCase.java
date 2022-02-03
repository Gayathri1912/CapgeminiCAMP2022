package com.demo.day5.strings;

import java.util.Scanner;

public class StringLowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		 String s = sc.nextLine();
	        String str = null;
	        System.out.println("To what case this string should be changed(u or L):");
	        char c = sc.next().charAt(0);
	        if(c=='u'||c=='U')
	            str= s.toUpperCase();
	        else if(c =='l' || c== 'L')
	            str= s.toLowerCase();
	        System.out.println(str);

	}

}
