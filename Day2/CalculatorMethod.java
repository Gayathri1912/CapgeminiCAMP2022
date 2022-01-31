/*Create a new class called “Calculator” which contains the following: 
1. A static method called powerInt(int num1,int num2) that accepts two integers and returns num1 to the power of num2 (num1 power num2). 
2. A static method called powerDouble(double num1,int num2) that accepts one double and one  integer and returns num1 to the power of num2 (num1 power num2). 
3. Call your method from another class without instantiating the class (i.e. call it like Calculator.powerInt(12,10) since your methods are defined to be static)
Hint: Use Math.pow(double,double) to calculate the power.
*/
package com.demo.day2;
import java.util.*;
class Calculator {
	static int powerInt(int a, int b) {
		int p = (int) Math.pow(a , b);
		return p;
		
	}
	static double powerDouble(double x, double y) {
		double p = Math.pow(x, y);
		return p;
	}
}
public class CalculatorMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer base :");
		int a = sc.nextInt();
		System.out.println("Enter integer base :");
		int b = sc.nextInt();
		System.out.println("Enter integer base :");
		double x = sc.nextDouble();
		System.out.println("Enter integer base :");
		double y = sc.nextDouble();
        Calculator k = new Calculator();
        int IntegerPower = k.powerInt(a, b);
        double DoublePower = k.powerDouble(x, y);
        System.out.println("Integer Power result = "+IntegerPower);
        System.out.println("Double Power result = "+DoublePower);

	}

}
