package com.javaintro;

public class Objectcount {
   static int count=0;
   static
   {
	   System.out.println("static block called");
   }
   {
	   count++;
	   System.out.println("end");
   }
	 
	public static void main(String[] args) {
		
		Objectcount obj1 = new Objectcount();
		Objectcount obj2 = new Objectcount();
		Objectcount obj3 = new Objectcount();
		Objectcount obj4 = new Objectcount();
		Objectcount obj5 = new Objectcount();
		
		
		
		System.out.println("print total no of count "+count);
	}

}
