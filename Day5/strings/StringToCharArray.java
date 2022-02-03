package com.demo.day5.strings;

import java.util.Scanner;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		char[] ch=s.toCharArray();  
		System.out.println("The characters used in the string are:");
		for(int i=0;i<ch.length;i++){  
		System.out.println(ch[i]);  
		}  

	}

}
