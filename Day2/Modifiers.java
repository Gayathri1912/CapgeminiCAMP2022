/*Create a package called test package;
Define a class called foundation inside the test package; 
Inside the class, you need to define 4 integer variables; 
Var1 as private; 
Var2 as default; 
Var3 as protected; 
Var4 as public; 
Import this class and packages in another class. 
Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.*/

package com.demo.day2;
class Foundation {
	int var1=1;
	public int var2=2;
	private int var3=3;
	protected int var4=4;
}
public class Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation k = new Foundation();
		
		System.out.println(k.var1); //default modifier is accessible
		
		System.out.println(k.var2);  //public modifier is accessible
		
	//	System.out.println(k.var3); //private is not in the visibility 
		
		System.out.println(k.var4);    //protected modifier is accessible
		
	}

}
