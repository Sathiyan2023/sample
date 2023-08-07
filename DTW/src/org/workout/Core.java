package org.workout;
import java.util.Scanner;
public class Core {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), i = 0, j = 0;
		
		System.out.println("Value of a: "+a);
		
		int n = a;
		
		while(n > 0){
			
			i = n % 10;
			
			j = (j*10)+i;
			
			n = n/10;
		}
		
		System.out.println(j);
		
		if(a == j){
			System.out.println("Palindrome Number: "+j);
		}
		else{
			System.out.println("Not a Palindrome Number: "+j);
		}
	}
}
