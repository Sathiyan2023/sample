package org.array;

public class Vowels {
	
	public static void main(String[] args){
		
		String s = "Yume O Akiramete Shinde Kure";
		
		int vow = 0;
		int con = 0;
		
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(ch == 'a'|| ch == 'A'|| ch == 'e'|| ch == 'E'|| ch == 'i'|| ch == 'I'|| 
					ch == 'o'|| ch == 'O'|| ch == 'u'|| ch == 'U'){
				vow++;
			}
			else{
				con++;
			}
		}	
		System.out.println("Vowels Count: "+vow);
		System.out.println("Consonant Count: "+con);
	}
}
