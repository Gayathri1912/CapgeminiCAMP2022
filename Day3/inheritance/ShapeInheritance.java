package com.demo.day3.inheritance;
class Shapes {
	void draw() {
		System.out.println("Drawing Shapes");
	}
	void Erase() {
		System.out.println("Erasing Shapes");
	}
}
class Circles extends Shapes {
	void draw() {
		System.out.println("Drawing Circle");
	}
	void Erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shapes {
	void draw() {
		System.out.println("Drawing Triangle");
	}
	void Erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shapes {
	void draw() {
		System.out.println("Drawing Square");
	}
	void Erase() {
		System.out.println("Erasing Square");
	}
}
public class ShapeInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shapes c = new Circles();
       c.draw();
       c.Erase();
       Shapes t = new Triangle();
       t.draw();
       t.Erase();
       Shapes s = new Square();
       s.draw();
       s.Erase();
	}

}
