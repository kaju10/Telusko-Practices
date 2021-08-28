package com.kaju.exceptionhandling;

import java.util.Random;

public class ArrayIndexOutOfBoundsExceptionTest {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int a[]= new int[15];
		
		
		for(int i=0; i<a.length;i++) {
			a[i]=r.nextInt(50);
		}
		
		try {
			System.out.println(a[20]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Put range of position to find between 0 to 14");
		}
		
		
		
		for(int m : a) {
			System.out.println(m);
		}
		
	}
	
	
	
	

}
