package polymorphism;				//Method Overriding

import java.util.Scanner;

public class Student extends StudentDetails{
	
	public void studentInfo(String n, int m, String g){
		System.out.println("Name: "+n);
		System.out.println("Marks: "+m);
		System.out.println("Grade: "+g);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int m = sc.nextInt();
		String g = sc.next();
		
		Student s1 = new Student();
		s1.studentInfo(n, m, g);
	}
}
