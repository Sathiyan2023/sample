package exercises;

import java.util.Scanner;

public class Natural_Number {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		System.out.println("Enter the Starting Number: "+s);
		
		int e = sc.nextInt();
		System.out.println("Enter the Ending Number: "+e);
		
		
		while(s <= e){
			System.out.println(s);
			s++;
		}
	}
}
