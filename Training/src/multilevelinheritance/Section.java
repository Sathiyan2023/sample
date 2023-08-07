package multilevelinheritance;

public class Section extends Standard{
	
	public void sec() {

		System.out.println("Section A");
	}
	
	public static void main(String[] args){
		
		Section s = new Section();
		s.name();
		s.firstStandard();
		s.sec();
	}
}

