package com.javaintro;

public class Bankaccount {
	
	long AccNo;
    String Accountholder_name;
    int Balance;
   
    static int Accnogenerator=123456;
    {
    	Accnogenerator++;
    }
    void display() {
    	System.out.println("AccNo:"+AccNo);
    	System.out.println("Accountholder_name:"+Accountholder_name);
    	System.out.println("Balance:"+Balance);
    	System.out.println();
    }
	public static void main(String[] args) {
		
	 
		
		Bankaccount b1=new Bankaccount();
		b1.AccNo=Accnogenerator;
		b1.Accountholder_name="sagar";
		b1.Balance=10000;
		b1.display();
		
		Bankaccount b2=new Bankaccount();
		b2.AccNo=Accnogenerator;
		b2.Accountholder_name="sidhu";
		b2.Balance=12000;
		b2.display();
		
		
		Bankaccount b3=new Bankaccount();
		b3.AccNo=Accnogenerator;
		b3.Accountholder_name="sidhu";
		b3.Balance=12000;
		b3.display();
		
		
		
	}

}
