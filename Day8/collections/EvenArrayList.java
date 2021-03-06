package com.demo.day8.collections;
import java.util.ArrayList;

public class EvenArrayList {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public ArrayList<Integer> saveEvenNumbers(int N) {
		list = new ArrayList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
	}
	
	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
	}
	
	public Integer printEvenNumber(int N) {
		
		for (int item : list) {
			if(item==N) {
				return N;
			}
		}
		
		return 0;
	}


	public static void main(String[] args) {
		EvenArrayList e = new EvenArrayList();
		e.saveEvenNumbers(10);
		e.printEvenNumbers();
		int result = e.printEvenNumber(8);
		System.out.println("The number is: " + result);
		

	}

}
