package com.kaju.exceptionhandling.customisedExceptionHandling;

import java.util.Scanner;

public class ExceptionHandleTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ExceptionHandleTest obj = new ExceptionHandleTest();
		try {
			obj.checkNumber(n);
		}
		catch(InvalidNumberException e) {
			System.out.println(e.getMessage());
		}
			
		
		
	}
	
	public void checkNumber(int n) throws InvalidNumberException  {
		if(n>100) {
			throw new InvalidNumberException("The number should be less than 100");
		}
		else {
			System.out.println("Valid");
		}
	}

}
