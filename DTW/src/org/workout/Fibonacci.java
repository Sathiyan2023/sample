package org.workout;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();

		System.out.println("Value of a: " + a);

		System.out.println("Value of b: " + b);

		System.out.println("Fibonacci Seris...");

		for (int i = 0; i < 5; i++) {
			
			int c = a+b;
			
			System.out.println(c);
			
			a = b;
			b = c;
		}
	}
}



