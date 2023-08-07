package abstraction;		//Partial Abstraction

import java.util.Scanner;

public class Omnivore extends Animals{
	
	@Override
	public void lion(String n) {
	
		System.out.println(n);
	}
	
	@Override
	public void rabbit() {
		
		System.out.println("Rabbit is a Herbivore.");
	}
	
	@Override
	public void crow() {
		
		System.out.println("Crow is a Omnivore.");
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		Omnivore o = new Omnivore();
		o.lion(n);
		o.rabbit();
		
		//Object for Abstract Class
		//Syntax ---> (Class Name) (Object Name) = new (Child Class Name);
		
		Animals a = new Omnivore();
		a.crow();
	}
}
