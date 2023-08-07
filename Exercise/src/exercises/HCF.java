package exercises;

import java.util.Scanner;

public class HCF {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividend = sc.nextInt();
		
		System.out.println("Enter First Number: "+dividend);
		
		int divisor = sc.nextInt();
		
		System.out.println("Enter Second Number: "+divisor);
		
		int reminder, hcf = 0;
		
		do{
			reminder = dividend % divisor;
			
			if(reminder == 0){
				hcf = divisor;
			}
			else{
				dividend = divisor;
				divisor = reminder;
			}
		}while(reminder != 0);
		
		System.out.println("HCF: "+hcf);
	}
}




