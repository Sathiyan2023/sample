package org.exception;

public class Throws {
	
	public static void main(String[] args) throws NumberFormatException, InterruptedException{
		
		Thread.sleep(3000);
		String s = "abc123def";
		int p = Integer.parseInt(s);
		System.out.println(p);
		System.out.println("***Hello***");
	}
}

