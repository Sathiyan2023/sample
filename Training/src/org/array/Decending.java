package org.array;

public class Decending {
	
	public static void main(String[] args){
		
		int a[] = new int[5];
		
		a[0] = 100;
		a[1] = 400;
		a[2] = 600;
		a[3] = 900;
		a[4] = 1000;
		
		int temp;
		
		for(int i = 0; i < a.length; i++){
			for(int j = 1+i; j < a.length; j++){
				if(a[i] < a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}	
	}
}
