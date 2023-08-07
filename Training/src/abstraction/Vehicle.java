package abstraction;		//Fully Abstraction (OR) Interface

public class Vehicle implements Cars{
	
	@Override
	public void benz() {
		
		String n = "Benz is a Luxury Car.";
		System.out.println(n);
	}
	
	@Override
	public void bmw() {	
		
	}
	
	@Override
	public void audi() {
		
	}
	
	@Override
	public void ferrari() {
		
		String m = "Ferrari is a Sports Car.";
		System.out.println(m);
	}
	
	@Override
	public void lamborghini() {
		
	}
	
	public static void main(String[] args){
		
		Vehicle v = new Vehicle();
		v.ferrari();
		
		//Object for Interface
		//Syntax ---> (Class Name) (Object Name) = new (Child Class Name);
		
		Cars c = new Vehicle();					
		c.benz();
		
	}
}
