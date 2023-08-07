package decisionmakingstatements;			//If condition

import java.util.Scanner;

public class FirstStandard {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		float percent = sc.nextFloat();
		
		if(percent <= 90)
		{
			System.out.println("First Class");
		}
	}
}

