/*  Create a class called compartment which represents the ship compartments for watertight subdivision its height, width and breadth. 
Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.
To avoid conflict create this class in a new package called com.demo*/

package com.demo.day2;
import java.util.*;
class Compartment {
	double heights;
	double widths;
	double breadths;
	public Compartment(double height, double width,double breadth) {
		heights = height;
		widths = width;
		breadths = breadth;
	}
	
}
public class CompartmentShip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Compartment compartment = new Compartment(5.6,44.5,20.9);
		
		System.out.println(compartment.heights);
		System.out.println(compartment.widths);
		System.out.println(compartment.breadths);


	}

}
