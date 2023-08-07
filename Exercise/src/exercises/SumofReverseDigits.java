package exercises;

import java.util.Scanner;

public class SumofReverseDigits {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		System.out.println("Enter the Digits: "+num);
		
		int a = num;

		int sum = 0;

		int rem = 0;

		while (num > 0) {

			rem = num % 10;

			sum = sum + rem;

			num /= 10;
		}

		System.out.println("Given Digits: " + a);
		System.out.println("Sum of Digits: " + sum);
	}
}

