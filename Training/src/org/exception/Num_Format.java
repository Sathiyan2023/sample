package org.exception;

public class Num_Format {
	
	public static void main(String[] args){
		
		String s = "12345afd6943";
		int p = Integer.parseInt(s);
		System.out.println(p);
		System.out.println("Facing NumberFormat Exception");
	}
}
