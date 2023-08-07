package org.array;

public class StringPalindrome {
	
	public static void main(String[] args){
		String s = "malayalam";
		String reverse = "";
		
		for(int i = s.length()-1; i >= 0; i--){
			char c = s.charAt(i);
			reverse = reverse + c;
		}
		if(s.equals(reverse)){
			System.out.println("Palindrome String: "+reverse);	
		}
		else{
			System.out.println("Not a Palindrome String: "+reverse);
		}
	}
}
