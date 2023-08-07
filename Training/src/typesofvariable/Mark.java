package typesofvariable;					//Types of Variable

public class Mark {
	
	int maths = 99;							//Instance Variable 
	
	static int tamil = 93;					//Static Variable
	
	public void student() {
		
		int english = 97;					//Local Variable [Always First Priority]
		
		System.out.println(english);
		System.out.println(tamil);
		System.out.println(maths);
	}
	
	public static void main(String[] args){
		
		Mark m = new Mark();
		m.student();
	}
}
