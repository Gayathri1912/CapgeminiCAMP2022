/*Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. 
After performing the operation, the program should ask the user if he wants to continue.
If the user presses y or Y, then the program should continue displaying the menu 
else the program should terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ]*/
package com.demo.day4.loops;
import java.util.*;
public class OperationMenu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char d;
		do {
			System.out.println("Enter the choice(1-Add, 2-Sub)");
			int a = sc.nextInt();
			switch(a) {
			case 1: {
				System.out.println("Enter the Two Operandds");
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println("The result of the Addition is: "+(x+y));
				System.out.println("Do you want to continue,Type 'Y' or 'y' if yes");
				d = sc.next().charAt(0);
				break;
			}
			case 2: {
				System.out.println("Enter the Two Operandds");
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println("The result of the Subtraction is: "+(x-y));
				System.out.println("Do you want to continue,Type 'Y' or 'y' if yes");
				d = sc.next().charAt(0);
				break;
			}
			default : {
				System.out.println("Invalid Choice");
				System.out.println("Do you want to continue,Type 'Y' or 'y' if yes");
				d = sc.next().charAt(0);
			}
			}
		}
		while(d=='y' || d=='Y');
		
		

	}

}
