package loopingstatements;							//Do While Loop

import java.util.Scanner;

public class C {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		do{
			System.out.println(a);
			a++;
		}
		while(a < 10);
	}
}
