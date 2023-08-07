package org.exception;

public class StringIndex {

	public static void main(String[] args) {

		String s = "Hello";
		char c = s.charAt(9);
		System.out.println(c);
		System.out.println("Facing StringIndexOutOfBound Exception");
	}
}
