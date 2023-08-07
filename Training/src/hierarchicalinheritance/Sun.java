package hierarchicalinheritance;

public class Sun extends Space{
	
	public void planets() {
		
		System.out.println("Planets revolve around the Sun");

	}
	
	public static void main(String[] args){
		
		Sun s = new Sun();
		s.solarSystem();
		s.planets();
	}
}
