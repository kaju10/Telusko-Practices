package com.kaju.string;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("Lionel Messi");
		
		String str= "Lionel Messi";
		
		
		
		StringBuffer sbf4 = new StringBuffer(str);
		System.out.println(sbf.compareTo(sbf4));
		System.out.println(sbf.equals(sbf4));
		System.out.println(sbf==sbf4);
				
		
		System.out.println(sbf.equals(str));
		
		
		StringBuffer sbf2 = new StringBuffer("Lionel Messi");
		System.out.println(sbf.compareTo(sbf2));
		System.out.println(sbf==sbf2);
		
		
		StringBuffer sbf5=sbf;
		System.out.println(sbf==sbf5);
		System.out.println(sbf.compareTo(sbf5));
		
		
		StringBuffer sbf3 = new StringBuffer("Cristiano Ronaldo");
		StringBuffer sbf6 = sbf3;
		sbf3.append(" 7");
		System.out.println(sbf3);
		System.out.println(sbf6);
		System.out.println(sbf3.hashCode());
		System.out.println(sbf6.hashCode());
		System.out.println(sbf.compareTo(sbf3));
		System.out.println(sbf6.compareTo(sbf3));
		System.out.println(sbf3==sbf6);
		
		
		sbf.append(" 10");
		System.out.println(sbf);
		
		
		sbf.reverse();
		System.out.println(sbf);
		
		
		
		
		
	}

}
