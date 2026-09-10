package com.javaintro;

public class Employeeinfo {
	
	byte EmployeeID= 01;
	short EmployeeAge=21;
	double EmployeeSalary=30000D;
	char EmployeeGrade='A';
	float YearsofExpierience =2.5f;
	boolean EmployeeisActive=true;
	int NumberofLeaves =32;
	long phonerelatednumericvalue=7013574816L;
	
	 void display(){
	System.out.println(EmployeeID);
	System.out.println(EmployeeAge);
	System.out.println(EmployeeSalary);
	System.out.println(EmployeeGrade);
	System.out.println(YearsofExpierience);
	System.out.println(EmployeeisActive);
	System.out.println(NumberofLeaves);
	System.out.println(phonerelatednumericvalue);
	}
	
	public static void main(String[] args) {
		Employeeinfo p=new Employeeinfo();
		p.display();
		
		
	}

}
