package org.workout;

public class Pali {
	
	public static void main(String[] args) {
		
		for(int k = 1; k <= 1000; k++){
			
			int a = k, i = 0, j = 0;
			
			int n = a;
			
			while(n > 0){
				
				i = n%10;
				j=(j*10)+i;
				n=n/10;
			}
			
			if(a == j){
				System.out.println(j);
			}
		}
	}
}
