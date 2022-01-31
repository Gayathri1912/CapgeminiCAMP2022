/*ZeeZee Bank
> Sample Input and Output 1:

    Enter the account number:
    9876543210
    Enter initial balance:
    15000
    Enter the amount to be deposited:
    1500
    Available balance is:16500.00
    Enter the amount to be withdrawn:
    500
    Available balance is:16000.00
*/
package com.demo.day2;
import java.util.*;
public class ZeeZeeBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number:");
		long accno = sc.nextLong();
		System.out.println(" Enter initial balance:");
		int accbal = sc.nextInt();
		System.out.println("Enter the amount to be deposited:");
		int amdep = sc.nextInt();
		accbal+=amdep; // Adding amount deposited to account balance.
		System.out.println("Enter the amount to be withdrawn:");
		int amwit = sc.nextInt();
		accbal -= amwit; //Subtracting amount withdrawn from account balance.
		System.out.println(" Available balance is: "+accbal);

	}

}
