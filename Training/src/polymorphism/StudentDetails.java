package polymorphism;		//Method Overloading

import java.util.Scanner;

public class StudentDetails {
	
	public void studentInfo(String n) {
		
		System.out.println("Student Name: "+n);
	}
	
	public void studentInfo(String n, int m){
		
		System.out.println("Student Name: "+n);
		System.out.println("Student Mark: "+m);
	}
	
	public void studentInfo(String n, int m, String g){
		
		System.out.println("Student Name: "+n);
		System.out.println("Student Mark: "+m);
		System.out.println("Student Grade: "+g);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int m = sc.nextInt();
		String g = sc.next();
		
		StudentDetails s = new StudentDetails();
		s.studentInfo(n, m, g);
	}
}

