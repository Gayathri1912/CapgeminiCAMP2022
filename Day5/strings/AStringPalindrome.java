//Write a Program that will check whether a given String is Palindrome or not
package com.demo.day5.strings;
import java.util.*;
public class AStringPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		boolean flag = true;  
        s = s.toLowerCase();  
        for(int i = 0; i < s.length()/2; i++){  
            if(s.charAt(i) != s.charAt(s.length()-i-1)){  
                flag = false;  
                break;  
            }  
        }  
        if(flag)  
            System.out.println("Given string is palindrome");  
        else  
            System.out.println("Given string is not a palindrome");  
    }  

}
