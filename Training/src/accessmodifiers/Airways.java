package accessmodifiers;		//Access Specifiers (or) Access Modifiers

public class Airways {
	
	public void indianAirways(){					//Public - Global Level Access
		
		System.out.println("Indian Airways!");
	}
	
	private void emirates(){						//Private - Class Level Access
		
		System.out.println("Emirates!");
	}
	
	protected void qatarAirways(){					//Protected - Same Package + Different Package but object instance can't be called.
		
		System.out.println("Qatar Airways!");
	}
	
	void britishAirways(){							//Default - Only Same Package
		
		System.out.println("British Airways!");
	}
	
}
