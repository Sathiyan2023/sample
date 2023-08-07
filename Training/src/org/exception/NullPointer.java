package org.exception;

public class NullPointer {

	public static void main(String[] args) {
		String s = null;
		char c = s.charAt(3);
		System.out.println(c);
		System.out.println("Facing NullPointer Exception");
	}
}
