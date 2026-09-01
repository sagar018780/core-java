package com.javaintro;

public class Institue {
	// 1 static variable declaration
		static String trainername1;
		static String trainername2;
	//2 instance variable declaration
		int employeeId;
		String employeeName;
		String employeedesignation;
		
	public static void main(String[] args) {
		//initializing values
				trainername1="vishwa";
				trainername2="Srikanth";
		//object creation
				Institue emp1 = new Institue();
				Institue emp2 = new Institue();
				Institue emp3 = new Institue();
				Institue emp4 = new Institue();
				Institue emp5 = new Institue();
		//initializing values
				emp1.employeeId=18;
				emp1.employeeName="sagar";
				emp1.employeedesignation="developer";
				
				emp2.employeeId=07;
				emp2.employeeName="harish";
				emp2.employeedesignation="trainee";
				
				emp3.employeeId=45;
				emp3.employeeName="siddu";
				emp3.employeedesignation="tester";
				
				emp4.employeeId=12;
				emp4.employeeName="babbul";
				emp4.employeedesignation="sales";
				
				emp5.employeeId=18;
				emp5.employeeName="kanny";
				emp5.employeedesignation="data Anlytics";
				
				
				
				System.out.println( " trainername1: "+trainername1);
				System.out.println( " trainername2: "+trainername2);
				System.out.println("***********************************");
				System.out.println("employeeId: "+emp1.employeeId);
				System.out.println( "employeeName: "+emp1.employeeName);
				System.out.println( "employeedesigination: "+emp1.employeedesignation);
				
				System.out.println("***********************************");
				System.out.println("employeeId: "+emp2.employeeId);
				System.out.println( "employeeName: "+emp2.employeeName);
				System.out.println( "employeedesigination: "+emp2.employeedesignation);
				
				System.out.println("***********************************");
				System.out.println("employeeId: "+emp3.employeeId);
				System.out.println( "employeeName: "+emp3.employeeName);
				System.out.println( "employeedesigination: "+emp3.employeedesignation);
				
				System.out.println("***********************************");
				System.out.println("employeeId: "+emp4.employeeId);
				System.out.println( "employeeName: "+emp4.employeeName);
				System.out.println( "employeedesigination: "+emp4.employeedesignation);
				
				System.out.println("***********************************");
				System.out.println("employeeId: "+emp5.employeeId);
				System.out.println( "employeeName: "+emp5.employeeName);
				System.out.println( "employeedesigination: "+emp5.employeedesignation);
				System.out.println("***********************************");
				System.out.println("END");

		
	}

}
