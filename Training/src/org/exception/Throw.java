package org.exception;

public class Throw {
	
	public static void main(String[] args){
		
		try{
			String s = "abc123def";
			int p = Integer.parseInt(s);
				throw new NumberFormatException();
		}
		catch(Exception e ){
			//e.printStackTrace();
			System.out.println(e.toString());
			//System.out.println(e.getMessage());
		}
		System.out.println("****Hello****");
	}
}
