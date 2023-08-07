package accessspecifiers;		//Access Specifier (OR) Access Modifiers

import accessmodifiers.Airways;

public class Flights extends Airways{
	
	public static void main(String[] args){
		
		Flights f = new Flights();
		
		f.indianAirways();							//Global Level
		//f.emirates();								//Can't be accessed because of Class Level Access
		f.qatarAirways();
		//f.britishAirways();						//Only Same Package Access
	
		Airways a = new Airways();
		//a.qatarAirways();							//Error - Can't create object instance.
	}
}
