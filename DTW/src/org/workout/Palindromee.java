package org.workout;

import java.util.Scanner;

public class Palindromee {

public static void main(String[] args){
		
		int a, b, c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Palindrome Limit: ");
		
		int x = sc.nextInt();
		
		System.out.println("Palindrome Numbers are as follows: ");
		
		for(int i = 1; i <= x; i++){
			
			a = i; 
			
			while(a > 0){
				
				b = a % 10;
				
				c = (c*10)+b;
				
				a = a/10;
			}
			
			if(c == i){
				
				System.out.println(i);
			}
			c = 0;	
		}
	}
}


