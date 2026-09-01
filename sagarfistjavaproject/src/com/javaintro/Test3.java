package com.javaintro;

public class Test3 {
	
	public void method4()
	{
		System.out.println("instance method from instance method   -directly-");
	};
	
	public static void method3()
	{
		Test3 i2=new Test3();
		i2.method4();
		System.out.println("static from instance -directly-");
	};
	
	public void method2()
	{ 

		method3();
		System.out.println("instance method from static method -object creation requires-");
		
	};
	
	public static void method1() {
		Test3 i =new Test3();
		i.method2();
		System.out.println("static from static  -directly-");
	}

	
	public static  void welcome() {
		method1();
		System.out.println("***THE END**** ");	
	}	
	
	// main method
	public static void main(String[] args) {
		System.out.println("main method started");
	
	 welcome();
		System.out.println("main method ended");
	}

}
