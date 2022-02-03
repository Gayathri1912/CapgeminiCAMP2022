package com.demo.day5.strings;
import java.util.*;
public class AvaMiaCipher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s1;
        System.out.println("Enter the encoded text:");
        s1=sc.nextLine();
        char[] a=s1.toCharArray();
        char[] a2=new char[a.length];
        int j=0,counter=0;
        for(int i=0;i<a.length;i++)
        {
            int value=(int)a[i];
            if(value<65 || (value>90 && value<97) || value>122){
              if(value==32)
                a2[j++]=' ';
              else
               continue;
            }
            else{
                value=value-7;
                if(value<97 && value>89)
                   value=value+26;
                if(value<65)
                   value=value+26;
                   
                a2[j++]=(char)value;
                counter=1;
            }
        }
        if(counter!=1){
            System.out.println("No hidden message");
            System.exit(0);
        }
        System.out.println("Decoded text:");
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i]);
        }
	}
}
