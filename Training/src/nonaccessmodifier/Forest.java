package nonaccessmodifier;				//Non-Access Modifier - 'final'

public final class Forest {				//Class Level - Can't Inherit
	
	final int a = 100;					//Variable Level - Can't Change Value
	
	public final void trees(){			//Method Level - Can't Override
		
		//a = 200;						//Can't change value - Already assigned in final.
		
		System.out.println(this.a);
	}
	
	public static void main(String[] args){
		
		Forest f = new Forest();
		f.trees();
	}
}
