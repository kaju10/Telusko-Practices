package com.kaju.collection_practice.comparator;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		if(o2>o1)
			return 1;
		
		return -1;
	}

}
