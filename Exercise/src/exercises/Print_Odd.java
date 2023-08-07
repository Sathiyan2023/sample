package exercises;
import java.util.Scanner;
public class Print_Odd {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int n = sc.nextInt();
	
		System.out.println("The Odd Numbers are .....");
		
		for(int i = 1; i <= n; i++){
			
			if (i % 2 == 1) {
				
				System.out.println(i);
			}
			
		}
	}
}
