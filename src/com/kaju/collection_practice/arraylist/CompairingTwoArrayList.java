package com.kaju.collection_practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompairingTwoArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","X","Y","Z"));
		
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("X","Y","Z","A","B","C"));
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","X","Y","P"));
		
		
		//Using sort and .equals
		//prints true
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));
		
		//prints false
		Collections.sort(l1);
		Collections.sort(l3);
		System.out.println(l1.equals(l3));
		
	}

}
