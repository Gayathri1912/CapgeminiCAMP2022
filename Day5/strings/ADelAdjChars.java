/*
 Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

If inputs are "abcXY123XYijk" and "XY", output should be "c13i".
If inputs are "XY123XY" and "XY", output should be "13".
If inputs are "XY1XY" and "XY", output should be "11".*/
package com.demo.day5.strings;
import java.util.Scanner;
public class ADelAdjChars {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter the word: ");
		String w = sc.nextLine();
		String str = "";
		  int end = 0;
		  int l =s.length();
		 for(int i=0;i<l;i++) {
		    
		    end = i + w.length();
		    if( end > l) {
		      end=l;
		    }
		    
		    if(s.substring(i,end).equals(w)) {
		      
		      if(i>0) {
		        str = str + s.charAt(i-1);
		      }
		      
		      if(i+w.length() <l) {
		        str = str + s.charAt(end);
		      }
		      
		    }
		   
		  }
		  System.out.println(str);
	}

}
