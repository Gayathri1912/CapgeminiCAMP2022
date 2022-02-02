/* Write a program to accept gender ("Male" or "Female") and age (1-120) 
from command line arguments and print the percentage of interest based on the given conditions.
Interest == 8.2% 
 Gender ==> Female
 Age    ==>1 to 58
Interest == 7.6% 
 Gender ==> Female
 Age    ==>59 -120
Interest == 9.2% 
 Gender ==> Male
 Age    ==>1-60
Interest == 8.3% 
 Gender ==> Male
 Age    ==>61-120
*/
package com.demo.day4.loops;
import java.util.*;
public class InterestGenderAge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String g = args[0];
	        int age = Integer.parseInt(args[1]);
	        if(args.length==0)
	        {
	            System.out.println("Empty Arguments");
	        }  
	        else {
	        	if(g.equals("Male") || g.equals("Female"))
	            {
	                if(age>1 && age<=100)
	                {
	                	if (g.equals("Female") && (age >= 1 && age <= 58)) {
	                        System.out.println("Interest == 8.2%");
	                    } else if (g.equals("Female") && (age >= 59 && age <= 100)) {
	                        System.out.println("Interest == 9.2%");
	                    } else if (g.equals("Male") && (age >= 1 && age <= 58)) {
	                        System.out.println("Interest == 8.4%");
	                    } else if (g.equals("Male") && (age >= 59 && age <= 100)) {
	                        System.out.println("Interest == 10.5%");
	                    }
	                }
	                }

	        }
	}

}
