package com.kaju.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFilterReduce {
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//using map and reduce to first multiply each number in the list by 2 and then
		//adding one with the other
		System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
		
		//using filter and reduce to find the even numbers in the list and adding them and then using method referencing 
		System.out.println(values.stream().filter(i->i%2==0).reduce(0,Integer::sum));
		
		//printing values while using filter method
		values.stream().filter(i->i%2!=0).forEach(System.out::println);
		
		
		
		
		System.out.println();
		
		
		
		
		//printing values while using filter method and using consumer in foreach
		values.stream().filter(i->i%2!=0).forEach(i->System.out.println(i));
		
		System.out.println();
		
		
		//using filter method and using consumer in foreach to add the numbers in the list
		List<Integer> list=new ArrayList<>();
		values.stream().filter(i->i%2!=0).forEach(i->list.add(i));
		System.out.println(list);
		
		
		
		System.out.println(values.stream().map(i->i*2).collect(Collectors.toList()));
		
		
	}
	
	

}
