package singleinheritance;

public class Automobile extends Vehicle{
		
	public void bus() {

		System.out.println("Volvo");

	}
		
	public static void main(String[] args){
		
		Automobile a = new Automobile();
		a.car();
		a.bike();
		a.bus();
	}
}
