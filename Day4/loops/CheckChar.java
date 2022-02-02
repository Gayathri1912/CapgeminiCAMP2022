/* Initialize a character variable in a program and if the value is alphabet then print "Alphabet" 
if it’s a number then print "Digit" and for other characters print "Special Character"*/
package com.demo.day4.loops;
import java.util.*;
public class CheckChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char a = sc.next().charAt(0);
		if(((int)a>64 && (int)a<91) || ((int)a>96 && (int)a<123)) {
			System.out.println("The given character is an alphabet");
		}
		else if((int)a>47 && (int)a<58) {
			System.out.println("The given character is a Digit");
		}
		else {
			System.out.println("The given character is a Special Character");
		}
	}

}
