package com.demo.day6.threads;
public class PrintOneToTen implements Runnable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintOneToTen p = new PrintOneToTen();
		Thread t = new Thread(p);
		t.start();

	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i=6;i<=10;i++) {
			System.out.println(i);
		}
	}

}