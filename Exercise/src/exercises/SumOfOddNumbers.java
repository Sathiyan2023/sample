package exercises;

import java.util.Scanner;

public class SumOfOddNumbers {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Limit");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <=n; i++){
			if(i % 2 == 1){
				sum = sum + i;
			}
		}
		System.out.println("Sum of Odd Numbers: "+sum);
	}
}
