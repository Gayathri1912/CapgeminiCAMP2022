/*Harry is very much interested in learning numerology with a programming Language. Help Harry to implement this task. 
Write a java program to find the sum of the digits and the numerology number(Multi-digit numbers are added and reduced to a single digit),
 followed by the total number of odd numbers and the total number of even numbers. Assume input is greater than zero and less than 10000000. 
For example, if the given number is 7654 then, 
Sum of digits: 22 (7+6+5+4) 
Numerology number: 4 ((7+6+5+4 =22 => 2+2) sum of digits is again added and reduced to a single digit). 
Number of odd numbers: 2 
Number of even numbers: 2 */
package com.demo.day2;
import java.util.*;
public class NumerologyNum {
	public static void main(String[] args) {
		//Creating scanner to take inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 0 to 10000000:");
		int n = sc.nextInt();
		int num = n;
		int sum =0,even=0,odd=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			n=n/10;
			sum+=rem;
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
	
		int numno=sum,number=0;
		while(numno>9) {
			number = numerologyNum(numno);
			numno=number;
		}
		//printing outputs
		System.out.println("Sum of digits: "+sum);
		System.out.println("Numerology number: "+number);
		System.out.println("Number of odd numbers: "+odd);
		System.out.println("Number of even numbers: "+even);
		
	}
	//method to find the final Numerology number from sum of digits
	public static int numerologyNum(int numno) {
		int an=0,r=0,a=numno;
		while(a!=0) {
			r =a%10;
			an+=r;
			a=a/10;
		}
		return an;
	}

}
