package abstraction;			//Partial Abstraction (OR) Abstract Class

public abstract class Animals {
	
	public void lion(String n) {				//Non-Abstract Method
		
		System.out.println(n);
	}
	
	
	public abstract void rabbit();				//Abstract Method
	
	
	public abstract void crow();
}
