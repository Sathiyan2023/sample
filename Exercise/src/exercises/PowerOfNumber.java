package exercises;

import java.util.Scanner;

public class PowerOfNumber {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Base Number: ");
		
		int b = sc.nextInt();
		
		System.out.println("Enter the Power Number: ");
		
		int p = sc.nextInt();
		
		int result = 1;
		
		for(int i = 1; i <= p; i++){
			
			result *= b;
		}
		System.out.println(b+" to the power of "+p+" is :"+result);
	}
}
