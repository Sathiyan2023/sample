package org.workout;
import java.util.Scanner;
public class SwappingNoswithThirdNo {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println("Value of a: "+a);
		
		int b = sc.nextInt();
		System.out.println("Value of a: "+b);
		
		int c = 0;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swapping Two Numbers with Third Number");
		System.out.println("Swapped Value of a: "+a);
		System.out.println("Swapped Value of b: "+b);
		
	}
}



