package Object;

public class UnionTerritory {
	
	public void pondicherry() { 
		System.out.println("Pondicherry");
	}

	public void diuDaman() {
		System.out.println("Diu & Daman");
	}
	
	public static void main(String[] args){
		
	//Object Syntax --->(Class Name) (Object Name) = new (Class Name)();
		
		
		UnionTerritory u = new UnionTerritory();		//Object 
		
		u.pondicherry();
		u.diuDaman();
		
	}
}
