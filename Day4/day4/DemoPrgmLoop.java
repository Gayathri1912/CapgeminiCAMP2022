package com.demo.day4;
class Loop {
	void show() {
		// for loop demo
		for (int i = 0; i < 9; i++) {
			System.out.println("numners" + i);
		}
		// while loop demo
		int i = 0;
		while (i < 9) {
			i++;
			System.out.println("numners" + i);
		}
		// do while loop
		int k=0;	
		do {	
			k++;
			System.out.println("numners" + k);
		} while(k < 9);
	}
}
public class DemoPrgmLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop l = new Loop();
		l.show();
	}

}