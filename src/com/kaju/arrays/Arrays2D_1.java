package com.kaju.arrays;

public class Arrays2D_1 {
	
	public static void main(String[] args) {
		int a[][] = { 
					{ 5, 6, 7, 8 },
					{ 10, 11, 12, 13 }, 
					{ 14, 15, 16, 17 } 
					};
		
		
		for(int p[] : a) {
			for(int m : p) {
				System.out.print(m + " ");
			}
			System.out.println();
			
		}
		
	}

}
