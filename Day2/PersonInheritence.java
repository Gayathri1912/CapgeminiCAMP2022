/*
 Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.The other data members of the employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java
Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.*/
package com.demo.day2;
class Person {
	String name1;
	void Name(String name) {
		System.out.println("The name of the person is " +name1);
	}
}
class Employee extends Person {
	String name1;
	double salary1;
	int year1;
	String insurance1;
	public Employee(String name, double salary, int year, String insurance) {
		super();
		name1 = name;
		salary1 = salary;
		year1 = year;
		insurance1 = insurance;
	}
	void PrintDetails() {
		System.out.println("The name of the Employee is " +name1);
		System.out.println("The Annual Salary of the Employee is " +salary1);
		System.out.println("The Joining Year of the Employee is " +year1);
		System.out.println("The Insurance of the Employee is " +insurance1);
	}
	
}
public class PersonInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Gayathri", 400000, 2022, "3fw64r321ad");
	    employee.PrintDetails();

	}

}
