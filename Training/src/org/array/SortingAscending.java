package org.array;

import java.util.Arrays;

public class SortingAscending {
	
	public static void main(String[] args){
		
		int a[] = new int[5];
		
		a[0] = 70;
		a[1] = 90;
		a[2] = 30;
		a[3] = 60;
		a[4] = 120;
		
		Arrays.sort(a);						//with Arrays.sort(a);	
		
		int l = a.length;
		System.out.println("Length of Array: "+l);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
