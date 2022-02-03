package com.demo.day5.strings;
import java.util.Scanner;
public class StringReplaceAll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("What part do you want to replace:");
		String c = sc.nextLine();
		System.out.println("This part should be replaced by:");
		String a = sc.nextLine();
		String str = s.replaceAll(c, a);
		System.out.println(str);

	}

}
