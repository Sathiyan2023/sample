package org.exception;

public class Try_Catch {
	
	public static void main(String[] args){
		
		try{
			String s = "abc123def";
			int p = Integer.parseInt(s);
		}
		catch(Exception e ){
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			
		}
		System.out.println("*********Hello*************");
	}
}
