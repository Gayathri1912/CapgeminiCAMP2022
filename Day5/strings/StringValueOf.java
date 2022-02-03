package com.demo.day5.strings;

import java.util.Scanner;

public class StringValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value ");
		int a = sc.nextInt();
		String s = String.valueOf(a);
        System.out.println(s);
	}

}
