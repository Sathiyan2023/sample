package org.encapsulation;
//import java.util.Scanner;
public class EmployeeData {
	
	public static void main(String[] args){
		
		//Scanner sc = new Scanner(System.in);
		
		//int setId = sc.nextInt();						//Scanner Class
		
		EmployeeDetails arul = new EmployeeDetails();
		
		arul.setId(12);
		arul.setName("Arul");
		arul.setSalary(50000);
		
		//System.out.println("Employee ID: "+setId);	//Scanner Class
		System.out.println("Employee ID : "+arul.getId());
		System.out.println("Employee Name: "+arul.getName());
		System.out.println("Employee Salary: "+arul.getSalary());
		
	}
}


