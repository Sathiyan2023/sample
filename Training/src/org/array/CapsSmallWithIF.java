package org.array;

public class CapsSmallWithIF {
	
	public static void main(String[] args){

		String s = "Hello World";

		int caps = 0, small = 0, numbers = 0, special = 0;
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			
			if(c>='A' && c<='Z'){
				caps++;
			}
			else if (c>='a' && c<='z'){
				small++;
			}
			else if (c>='0' && c<='9'){
				numbers++;
			}
			else{
				special++;
			}
		}
		
		System.out.println("Caps: "+caps);
		System.out.println("Small: "+small);
		System.out.println("Numbers: "+numbers);
		System.out.println("Special: "+special);
	}
	
}
