package org.workout;

public class EvenOddSum {
	
	public static void main(String[] args){
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 1; i <= 10; i++){
			if(i%2 == 0){
				evenSum = evenSum + i;
			}
			else{
				oddSum = oddSum + i;
			}
		}
		System.out.println("Even Number Summation: "+evenSum);
		System.out.println("Odd Number Summation: "+oddSum);
	}
}



