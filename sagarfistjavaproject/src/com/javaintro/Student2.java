package com.javaintro;

public class Student2 {
	
	String Name ;
	int Age;
	String College;
	
	void display() {
	 System.out.println("name : "+Name);
	 System.out.println("Age :" + Age);
	System.out.println("College :"+ College);	
	}
		
	
	public static void main(String[] args) {
		Student2 l = new Student2();
		l.Name="sagar";
		l.Age= 21;
		l.College="oxford";
		
	     l.display();
		
		
		
	}

}
