package com.javaintro;

public class Cricket {
//declaration
	//static
	static int countrycode;
	static String countryname;
	//instance
	int jerseynumber;
	String jerseyname;
	
	public static void main(String[] args) {
	//initializing values
	countrycode=91;
	countryname="India";
	
	Cricket vk =new Cricket();
    vk.jerseynumber=18;
    vk.jerseyname="viratkohli";
	
    //accessing values
   
    System.out.println("main method started");
   System.out.println("welcome to only indian cricket team"); 
    System.out.println("countrycode : "+ countrycode);  
	System.out.println("countryname " +countryname);
	
	System.out.println("********kohli**********");
	System.out.println("countrycode : "+ countrycode);  
	System.out.println("countryname " +countryname);
	System.out.println("jerseynumber: "+vk.jerseynumber);
	System.out.println("jerseyname :"+vk.jerseyname);
	
	
	System.out.println("********MS**********");
	countrycode=92;
	countryname= "Pakistan";
	Cricket ms =new Cricket();
	ms.jerseynumber=07;
	ms.jerseyname="mahendra singh dhoni";
	
	System.out.println("countrycode : "+countrycode);
	System.out.println("countryname : "+countryname);
    System.out.println("jerseynumber : "+ms.jerseynumber);
    System.out.println("jersey name : "+ms.jerseyname);
	
    System.out.println("********kl**********");
  
    System.out.println("countrycode : "+countrycode);
	System.out.println("countryname : "+countryname);
    
	
	}

}
