package org.workout;

import java.util.Scanner;

public class Amst {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), i = 0, j = 0;

		int n = a;

		while (n > 0) {

			i = n % 10;

			j = (i*i*i) + j;
			
			n = n/10;
		}
		
		if (a == j) {
			
			System.out.println("Amstrong Number: " + j);
		}
		
		else{
			System.out.println("Not an Amstrong Number: "+j);
		}
	}
}








