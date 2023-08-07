package exercises;

import java.util.Scanner;

public class Reverse_Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		System.out.println("Enter the Digits: "+num);
		
		int a = num;

		int rev = 0;

		int rem = 0;

		while (num > 0) {

			rem = num % 10;
			System.out.println(rem);
			rev = rev * 10 + rem;
            System.out.println(rev);
			num=num / 10;
			System.out.println(num);
		}

		System.out.println("Given Digits: " + a);
		System.out.println("Reverse Digits: " + rev);
	}
}

