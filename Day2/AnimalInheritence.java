/*1     Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.*/
package com.demo.day2;
class Animal {
	void Eat() {
		System.out.println("Animal is Eating");
	}
	void Sleep() {
		System.out.println("Animal is Sleeping");
	}
}
class Bird extends Animal {
	void Eat() {
		super.Eat();
		System.out.println("Bird is Eating");
	}
	void Sleep() {
		super.Sleep();
		System.out.println("Bird is Sleeping");
	}
	void Fly() {
		System.out.println("Bird is Flying");
	}
	
}
public class AnimalInheritence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Bird();
		Bird bird = new Bird();
		animal.Eat();
		animal.Sleep();
		bird.Fly();

	}

}
