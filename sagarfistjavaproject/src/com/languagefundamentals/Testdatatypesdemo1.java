package com.languagefundamentals;

public class Testdatatypesdemo1 {
	
	//byte = 8bits
	//by default RHS numeric values are integer
	// RANGE -128,-127.....0,1,2....126,127
	byte b =(byte) 130; //-126 explicit type casting converting int to byte is called explicit type casting
	byte b1= (byte)-256;
	
	//short = 2bytes = 16 bits = 2^15	
	//RANGE -32768 TO 32767
	
	short s = (short) 32768;
	short s1 = (short) 32767;
	short s2 = b;  // implicit type casting converting byte to short
	
	// int = 4bytes = 32bits =2^31
	// -2147483648 to 2147483647
	 int i =2147483647;
	// int i2 = 2147483648; / we cannot convert because out of range
	 int i1 = (int) 2147483648L ; // explicit type casting long to int
	 
	// long= 8bytes = 64 bits  =2^63
	 long L= 21474838L;
	 long L2 =9223372036854775807L;
	 
	 // by default RHS decimal point data will consider as double
	 // so when we represent float we must provide f or F as suffix.
	 // float = 4 bytes = 32 bits 
	 float f = 5.9f;
	 float f1 = 23232.23456723456F;
	 float f2 = 1234567890876543213456F;
	 
	 double d=56.456765324567;
	 
	 // char = 2bytes =16bits = -32767 + 32768 = 65535 --> 0
	 //A=65 B=66 ...M=77 N=78 ... Z=90
	 //a=97 b=98 ...m=109 n=110...z=122
	 char c= 'A';  // single quote character
	 char c1 =65; // ASCII values
	 
	 char c2 = '\u0040'; //uni-code-values or hex char values
	 char c3='\u7879';
	 char c4='\u0041';
	 char c5=7478;
	 
	 boolean boo= false; // true or false are the literals
	 

	public static void main(String[] args) {
		System.out.println("main method started");
		Testdatatypesdemo1 t1 = new Testdatatypesdemo1();
		System.out.println("byte value : "+t1.b);
		System.out.println("byte value : "+t1.b1);
		
		System.out.println("short value : "+t1.s);
		System.out.println("short value : "+t1.s1);
		
		System.out.println("int value : "+t1.i);
		System.out.println("int value : "+t1.i1);
		
		System.out.println("long value : "+t1.L);
		System.out.println("long value : "+t1.L2);
		
		System.out.println("float value : "+t1.f);
		System.out.println("float value : "+t1.f1);
		System.out.println("float value : "+t1.f2);
		
		System.out.println("double value : "+t1.d);
		
		System.out.println("char value : "+t1.c);
		System.out.println("char value : "+t1.c1);
		System.out.println("char value : "+t1.c2);
		System.out.println("char value : "+t1.c3);
		System.out.println("char value : "+t1.c4);
		System.out.println("char value : "+t1.c5);
		
		if(t1.boo) {
			System.out.println("good morning !");
		}

		{
			System.out.println("boolean value : "+ t1.boo); //false
		}
		
		
	}

}
