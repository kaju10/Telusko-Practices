package com.kaju.streamapi;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,9,8,7,16,25);
		
		//using for each loop and lamda expression
		values.forEach(i-> System.out.print(i + " "));
		
		
		System.out.println();
		System.out.println();
		
		//using for each loop and method referencing
		values.forEach(System.out::println);
		
		System.out.println();
		
		
		//using method referencing and doubling the numbers
		values.forEach(ForEachLoop::doubleNumber); 
		
	}
	
	
	public static void doubleNumber(int i) {
		System.out.print(i*2 +" ");
	}

}


