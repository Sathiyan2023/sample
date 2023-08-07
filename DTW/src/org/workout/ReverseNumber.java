package org.workout;
import java.util.Scanner;
public class ReverseNumber {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), i = 0, j = 0;
		
		System.out.println("Value of n: "+n);
		
		while(n > 0){
			
			i = n%10;
			
			j = (j*10)+i;
			
			n = n/10;
		}
		
		System.out.println("Reverse Number: "+j);
		
	}
}
