/*Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. Here’s what the class should do: 
1. Construct a class called Patient
2. Store a String name for the patient
3. Store weight and height for patient as doubles
4. Construct a new patient using these values
5. Write a method called BMI which returns the patient’s BMI as a double. BMI can be calculated as BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
6. Next, construct a class called “Patients” and create a main method. Create a Patient object and assign some height and weight to that object. Display the BMI of that patient.*/
package com.demo.day2;
import java.util.*;
class Patient {
	private String name1;
	private double height1;
	private double weight1;
	
	public Patient(String name, double height, double weight) {
		name1 = name;
		height1 = height;
		weight1 = weight;
	}
	
	public double BMI () {
		return (weight1/ (height1 * height1)) * 703;
	}
}
public class PatientVitalStats {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Patient patient = new Patient("Gayathri", 66, 130);
		System.out.println("BMI of the patient with given details is "+patient.BMI());
	}

}
