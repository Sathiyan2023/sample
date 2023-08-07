package org.string;

public class StringMethodsSet2 {

	public static void main(String[] args) {

		String s = "Yume O Akiramete Shinde Kure!";
		String s2 = "";
		
		String uc = s.toUpperCase();										//Changes String to Upper Case
		System.out.println("In Upper Case: "+uc);
		
		String lc = s.toLowerCase();										//Changes String to Lower Case
		System.out.println("In Lower Case: "+lc);
		
		boolean e = s2.isEmpty();											//Checks if String is empty or not
		System.out.println("Is String empty (T/F): "+e);
		
		String s1 = "     Yume O Akiramete      ";							//Removes the white spaces in the front & back
		String t = s1.trim();
		System.out.println(t);
		
		String r = s.replace("Yume", "Give");								//Replaces the word/letter
		System.out.println("After Replacing: "+r);
		
		int i = s.indexOf("O");												//Prints the String value
		int i1 = s.lastIndexOf("e");										//Prints the last String value
		System.out.println("Index of 'O': "+i);
		System.out.println("Last Index of: "+i1);
		
		boolean b = s.startsWith("Y");										//Checks if the String Starts with assigned letter/word
		System.out.println("String starts with 'Y' (T/F): "+b);
		
		boolean b1 = s.endsWith("e");										//Checks if the String Ends with assigned letter/word
		System.out.println("String ends with 'e' (T/F): "+b1);
		
		boolean b2 = s.contains("Yuma");									//Checks if the String contains the assigned letter/word 
		System.out.println("String contains Yuma (T/F): "+b2);
		
		boolean b3 = s.equals("Yume O Akiramete Shinde Kure");				//Compares the String words/letters
		System.out.println("String equals (T/F): "+b3);
		
		boolean b4 = s.equalsIgnoreCase("yume o akiramete shinde kure!");
		System.out.println("String equalsIgnoreCase (T/F): "+b4);
		
		int c = s.compareTo("Yume O Akiramete Shinde Kure!");				//Compares the String with ASCII Values
		System.out.println(c);
		
		int c1 = s.compareToIgnoreCase("yume o akiramete shinde kure!");
		System.out.println(c1);
	}
}
