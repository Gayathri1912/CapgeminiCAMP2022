/* A HighSchool application has two classes: the Person superclass and the Student subclass. Using inheritance, 
 in this lab you will create two new classes, Teacher and CollegeStudent.
 A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) and
 subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”). The CollegeStudent class will extend the Student class by adding 
 a year (current level in college) and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).*/
package com.demo.day2;
class Persons {
	String name;
	public void Person(String n) {
		name = n;
	}
}
class Teacher extends Persons {
	double salary;
	String subject;
	public Teacher (double sal, String sub) {
		salary = sal;
		subject = sub;
	}
	void PrintDetails() {
		System.out.println("Subject is " +subject);
		System.out.println("The Salary of the Teacher is " +salary);
	}
}
class Student extends Persons {
	String university;
	public Student (String u) {
		university  = u;
	}
	public void CollegeStudent(int i, String string) {
		// TODO Auto-generated method stub
		
	}
}
class CollegeStudent extends Student {
	public CollegeStudent(String u) {
		super(u);
		// TODO Auto-generated constructor stub
	}
	int year;
	String major;
	public void CollegeStudent(int y, String maj) {
		year = y;
		major = maj;
	}
	void PrintDetails() {
		System.out.println("The year of Study is " +year);
		System.out.println("The major of college student is " +major);
	}
	 
}
public class HighSchoolInheritence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persons p = new Teacher(45000,"Chemistry");
		Student s= new CollegeStudent("ECE");
	}

}
