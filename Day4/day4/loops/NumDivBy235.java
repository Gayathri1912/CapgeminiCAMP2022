package com.demo.day4.loops;
public class NumDivBy235 {
	public static void main(String[] args) {
		int i=0,j=1;
		while(i<=5) {
			if(j%2==0 && j%3==0 && j%5==0) {
				System.out.println(j);
				i++;
			}
			j++;
		}
	}

}
