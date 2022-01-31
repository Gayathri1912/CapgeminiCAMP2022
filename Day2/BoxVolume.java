/*Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, depth of double type). The class should have a method that can return volume. Obtain an object and print the corresponding volume in main() function.
*/
package com.demo.day2;
import java.util.*;
class Box {
	double volume(double l,double w, double h) {
		return (l*w*h);
	}
}

public class BoxVolume {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the box: ");
		double l = sc.nextDouble();
		System.out.println("Enter length of the box: ");
		double w = sc.nextDouble();
		System.out.println("Enter length of the box: ");
		double h = sc.nextDouble();
		Box k = new Box();
		double vol = k.volume(l,w,h);
        System.out.println("Volume of the box is "+vol);
		
	}

}