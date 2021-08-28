package com.kaju.exceptionhandling;

public class L1Question2Test {

	public static void main(String[] args) {
		try {
			System.out.println("In try block");
			int n=9/0;
			System.out.println("Result is" + n);
		}
		catch(Exception e) {
			System.out.println("In catch block 1");
			doStuff();
		}
//		catch(ArithmeticException ex) {
//			System.out.println("In catch block 2");
//		}
		finally {
			System.out.println("In finally block");
		}
	}
	
	public static void doStuff() {
		System.out.println(1+2);
	}
	
}
