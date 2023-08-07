package nonaccessmodifier;				//Non-Access Modifier - "Static"

public class Insects {					//Class Level - Can't use static in Class Name. [Main Class]
	
	public static class MicroInsects{	//Sub-Class Level - Can use 'static' in sub-class level. [Sub-Class]
		
	}
	
	public static void honeyBee(){		//Method Level - Using [(ClassName).(MethodName);]; we can directly call the method.
		
		System.out.println("Honey Bee!");
	}
	
	public static void main(String[] args){
		
		Insects.honeyBee();				//No need to create 'object' for "static method"
	}
}

