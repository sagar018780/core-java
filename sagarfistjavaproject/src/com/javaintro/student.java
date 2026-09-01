package com.javaintro;

public class student{
	public static void main() throws ClassNotFoundException
	{
		System.out.println("welcome to main method");
		Class.forName("java.lang.System");
		Class.forName("java.lang.Class");
		
		System.out.println("hello !! how are you! ");
		
		Class.forName("com.javaintro.student");
		Class.forName("com.javaintro.Welcome");
//		Class.forName("com.javaintro.Welcome1");
		System.out.println("ending of main method");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
	}
	
	
};
