package hierarchicalinheritance;

public class Moon extends Space{
	
	public void earth() {

		System.out.println("Earth has 1 Moon.");

	}
	
	public static void main(String[] args){
		
		Moon m = new Moon();
		m.solarSystem();
		m.earth();
	}
}
