package org.array;

public class CapsSmallSpecial {
	
	public static void main(String[] args){
		
		String s = "Yume O Akiramete Shinde Kure #47";
		
		int caps = 0;
		int small = 0;
		int numbers = 0;
		int specialChar = 0;
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(Character.isUpperCase(c)){
				caps++;
			}
			else if(Character.isLowerCase(c)){
				small++;
			}
			else if(Character.isDigit(c)){
				numbers++;
			}
			else{
				specialChar++;
			}
		}
		System.out.println("Capital Letters Count: "+caps);
		System.out.println("Small Letters Count: "+small);
		System.out.println("Numbers Count: "+numbers);
		System.out.println("Special Characters Count: "+specialChar);
	}
}	
