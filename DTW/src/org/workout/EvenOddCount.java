package org.workout;

public class EvenOddCount {
	
	public static void main(String[] args){
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i = 1; i <= 10; i++){
			if(i % 2 == 0){
				evenCount = evenCount+1;
			}
			else{
				oddCount += 1;
			}
		}
		System.out.println("Even Number Count: "+evenCount);
		System.out.println("Odd Number Count: "+oddCount);
	}
}
