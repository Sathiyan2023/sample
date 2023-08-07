package org.array;

public class ArraywithEnFor {
	
	public static void main(String[] args){
		
		int a[] = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		int l = a.length;
		System.out.println(l);
		
		for(int x : a){
			System.out.println(x);
		}
	}
}
