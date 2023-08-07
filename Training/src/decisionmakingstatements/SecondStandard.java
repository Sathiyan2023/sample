package decisionmakingstatements;			//If-else condition

import java.util.Scanner;

public class SecondStandard {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		double marks = sc.nextDouble();
		
		if(marks > 75){
			System.out.println("Distinction");
		}
		else {
			System.out.println("First Class");
		}
	}
}
