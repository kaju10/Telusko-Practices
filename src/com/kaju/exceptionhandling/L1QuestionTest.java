package com.kaju.exceptionhandling;

public class L1QuestionTest {
	
	public static void main(String[] args) {
		int a=5; int b=6; int result;
		try {
			if(args.length==0) {
				throw new Exception();
			}
		}
		catch(Exception e) {
			System.out.println("done");
			result=a+b;
			System.out.println(result);
		}
		finally {
			System.out.println("finally");
		}
		
	}

}
