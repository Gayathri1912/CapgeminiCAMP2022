package com.demo.day3.inheritance;

class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book: name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock ;
	}
	
}

public class AuthorInheritance {

	public static void main(String[] args) {
		Author author = new Author("xyz", "abcde123@gmail.com", 'F');
		Book book = new Book("Java Fundas", author, 250.0, 50);
		System.out.println(author.toString());
		System.out.println(book.toString());
	}

}