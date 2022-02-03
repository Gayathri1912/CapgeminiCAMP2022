package com.demo.day5.strings;

import java.util.Scanner;

public class StringJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the delimiter: ");
		String d = sc.nextLine();
		System.out.println("Enter string 2: ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 3: ");
		String s2 = sc.nextLine();
		System.out.println("Enter string 4: ");
		String s3 = sc.nextLine();
		String str = String.join(d,s1,s2,s3);
        System.out.println(str);
	}

}
