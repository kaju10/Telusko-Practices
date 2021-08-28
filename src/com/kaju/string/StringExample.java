package com.kaju.string;

public class StringExample {

	public static void main(String[] args) {
		
		String str= "Lionel Messi";
		String str2= "Lionel Messi";
		
		System.out.println(str.compareTo(str2));
		
		
		System.out.println(str==str2);
		
		
		System.out.println(str.equals(str2));
		
		str2="lionel messi";
		System.out.println(str.equals(str2));
		
		System.out.println(str==str2);
		
		
		String  str3= str;
		System.out.println(str==str3);
		System.out.println(str.hashCode());
		System.out.println(str3.hashCode());
		
		String  str4= str;
		str="Cristiano Ronaldo";
		System.out.println(str==str4);
		System.out.println(str.hashCode());
		System.out.println(str4.hashCode());
		
	}
	
}
