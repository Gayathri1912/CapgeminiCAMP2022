package com.demo.day5.strings;
import java.util.*;
public class StrtingGetBytes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The roll codes of the students attended the seminar: ");
		String s = sc.nextLine();
		byte[] attendance = s.getBytes();
		System.out.println("The Roll numbers of Attended Students are:");
        for(int i=0;i<attendance.length;i++) {
        	System.out.println(attendance[i]);
        }
	}

}
