package com.kaju.streamapi;

import java.util.Arrays;
import java.util.List;

public class SortedFindFirstOrElse {
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(5, 8, 20, 2, 35, 34, 39, 80, 14, 25);
		
		//using sorted() in stream to sort the even numbers
		values.stream().filter(i->i%2==0).sorted().forEach(System.out::println);
		
		
		System.out.println();
		
		//using sorted() {comparator one} in stream to sort the even numbers in descending order
		values.stream().filter(i->i%2==0).sorted((i,j)->i<j?1:-1).forEach(System.out::println);
		
		
		System.out.println();
		
		//using findFirst() to get the first number of the stream of even numbers after it got filtered
		System.out.println(values.stream().filter(i->i%2==0).findFirst().get());
		
		
		System.out.println();
		
		
		
		
		List<Integer> values2 = Arrays.asList(6,7,99,24,36,13);
		//using orElse() in stream
		System.out.println(values2.stream().filter(i->i%5==0).findFirst().orElse(0));
		
		
	}
	

}
