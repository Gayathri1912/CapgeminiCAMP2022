package com.demo.day5.strings;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String[] w=s.split(" ");
		System.out.println("The wors of the given String are:");
		for(int i=0;i<w.length;i++) {
			System.out.println(w[i]);
		}

	}

}
