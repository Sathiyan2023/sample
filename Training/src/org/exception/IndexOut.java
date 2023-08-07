package org.exception;

import java.util.List;
import java.util.ArrayList;

public class IndexOut {
	
	public static void main(String[] args){
		
		List l = new ArrayList();
		
		l.add(30);
		System.out.println(l.get(3));
		System.out.println("Facing IndexOutOfBound Exception");
		
	}
}
