package decisionmakingstatements;			//Nested If-else condition

import java.util.Scanner;

public class ThirdStandard {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		
		if(marks >= 35){
			if(marks >= 75){
				System.out.println("Distinction");
			}
			else{
				System.out.println("First Class");
			}
		}
		else {
			System.out.println("Fail");
		}
	}
}




