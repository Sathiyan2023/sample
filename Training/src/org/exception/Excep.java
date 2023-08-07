package org.exception;

public class Excep {
	
	public static void main(String[] args){
		try{
			String s = "abc123def";
			int p = Integer.parseInt(s);
			System.out.println(p);
		}
		catch(Exception e){
			System.out.println("Alphanumeric is present");
		}
		finally{
			System.out.println("Alphanumeric");
		}
	}
}

