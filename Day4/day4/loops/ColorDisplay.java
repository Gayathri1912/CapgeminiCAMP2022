/* Write a program to print the color name, based on color code.
 *  If color code in not valid then print "Invalid Code".
 *  R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.*/
package com.demo.day4.loops;
import java.util.*;
public class ColorDisplay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character for color(in caps): ");
		 char a=sc.next().charAt(0);
		 switch(a) {
		 case 'R' : System.out.println("REd");
		            break;
		 case 'B' : System.out.println("Blue");
		            break;
		 case 'G' : System.out.println("Green");
		            break;
		 case 'O' : System.out.println("Orange");
		            break;
		 case 'Y' : System.out.println("Yellow");
		            break;
		 case 'W' : System.out.println("White");
		            break;
		 default : System.out.println("Invalid Code");
		            break;
		 
		 }
	}

}
