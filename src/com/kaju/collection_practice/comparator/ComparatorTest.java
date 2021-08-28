package com.kaju.collection_practice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
	
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();

		values.add(247);
		values.add(741);
		values.add(98);
		values.add(598);
		values.add(132);
		values.add(865);
		
//		Collections.sort(values);
		
//		//reversingly sorting the list using comparator
//		ComparatorImpl com = new ComparatorImpl();
//		Collections.sort(values,com);
		
		
		//reversingly sorting the list using comparator and lamda expression
		Collections.sort(values, (i, j) -> (j > i) ? 1 : -1);
		
		for(int i : values) {
			System.out.println(i);
		}
		
	}

}
