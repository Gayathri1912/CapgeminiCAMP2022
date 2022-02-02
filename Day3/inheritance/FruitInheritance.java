package com.demo.day3.inheritance;
class Fruits {
	String name;
	String taste;
	int size;
	void eat() {
		String name="Mango";
	    String taste="Sweet";
	    int size=9;
		System.out.println("The fruit "+name+" is "+size+" cms in size and "+taste+" in taste.");
	}
}
class Apple extends Fruits {
	void eat() {
		System.out.println("Apple is Sweet in taste");
	}
}
class Orange extends Fruits {
	void eat() {
		System.out.println("Orange is Sour in taste");
	}
}
public class FruitInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits f = new Fruits();
		f.eat();
		Fruits a = new Apple();
		a.eat();
		Fruits o = new Orange();
		o.eat();

	}

}
