package exercises;

import java.util.Scanner;

public class Tables_Reverse {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		System.out.println(t+" Table ");
		
		int s = sc.nextInt();
		System.out.println("Starting Number: "+s);
		
		int e = sc.nextInt();
		System.out.println("Ending Number: "+e);
		
		while(s >= e){
			
			System.out.println(s+" * "+e+" = "+ (s*e));
			s--;
		}	
	}
}
