package org.array;

public class DuplicateValue {
	
	public static void main(String[] args){
		
		//int a[] = {150, 190, 150, 190, 50, 70};
		
		int a[] = new int[5];
		
		a[0] = 100;
		a[1] = 400;
		a[2] = 300;
		a[3] = 300;
		a[4] = 200;
		
		
		for(int i = 0; i < a.length; i++){
			for(int j = i+1; j < a.length; j++){
				if(a[i] == a[j]){
					System.out.println("Duplicate Values: "+a[j]);
				}
			}
		}	
	}	
}
