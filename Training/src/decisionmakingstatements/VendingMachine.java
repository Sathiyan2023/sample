package decisionmakingstatements;			//Switch Case

import java.util.Scanner;

public class VendingMachine {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int button = sc.nextInt();
		
		switch (button) {
		case 1:
			System.out.println("Cheetos");
			break;
		case 2:
			System.out.println("Lays");
			break;
		case 3:
			System.out.println("Kurkure");
			break;
		case 4:
			System.out.println("Bingo Chips");
			break;
		case 5:
			System.out.println("Princles");
			break;
		case 6:
			System.out.println("Uncle Chips");
			break;
		case 7:
			System.out.println("Too Yum");
			break;
		case 8:
			System.out.println("Doritos");
			break;
		case 9:
			System.out.println("Nacho Chips");
			break;
		case 10:
			System.out.println("Ruffles");
			break;
			
		default:
			System.out.println("Value out of range!");
			break;
		}
	}
}
