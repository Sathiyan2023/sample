package org.array;

public class ArraywithForLoop {
	
	public static void main(String[] args){
		
		int a[] = new int[10];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[2] = 60;
		a[6] = 70;
		a[7] = 80;
		a[8] = 80;
		a[9] = 90;
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
