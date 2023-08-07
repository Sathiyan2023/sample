package org.workout;
import java.util.Scanner;
public class SwappingwithoutThirdNo {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println("Value of a: "+a);
		
		int b = sc.nextInt();
		System.out.println("Value of b: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping - Value of a: "+a);
		System.out.println("After Swapping - Value of b: "+b);
	}
}
