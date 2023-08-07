package org.exception;
import java.util.Scanner;
public class InputMismatch {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		byte b = sc.nextByte();
		System.out.println(b);
		System.out.println("Facing InputMismatch Exception");
	}
}
