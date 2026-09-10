package com.javaintro;

public class Methods {
	 void method4() {
		System.out.println("method 4 called"); 
	};
     void method3() {
    	System.out.println("method 3 called");
    };
	 static void method2() {
		System.out.println("method 2 called");
	};
	static  void method1() {
		System.out.println("method 1 called");
    };
    static {
		Methods m1 = new Methods();
		method1();
		method2();
		m1.method3();
		m1.method4();
	}
	 public static void main() { 
	}
}
