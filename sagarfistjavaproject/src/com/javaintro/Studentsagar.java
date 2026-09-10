package com.javaintro;
import java.util.Scanner;

public class Studentsagar {
	
	int roll_number;
	String name;
	double salary$;
	
	 void read() {
		 System.out.println("read method called");
	 }
	 void write(){
		 System.out.println("write method called");
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Studentsagar s1 = new Studentsagar();
		System.out.println(s1.roll_number);
		System.out.println(s1.name);
		System.out.println(s1.salary$);
		s1.read();
		s1.write();
		

	}

}
