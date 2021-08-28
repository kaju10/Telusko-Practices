package com.kaju;

public class LambdaExpressionTest {
	
	public static void main(String[] args) {
		
		//lamda expression of the AbcImpl class
		Abc obj=()-> System.out.println("Neymar Junior");
		obj.show();
		
		
		
		
//		Abc obj= new AbcImpl();
//		obj.show();
		
//		not possible
//		obj.display();
	}

}

interface Abc{
	void show();
}

class AbcImpl implements Abc{
	
	public void show() {
		System.out.println("Lionel Messi");
	}
	
	public void display() {
		System.out.println("Cristiano Ronaldo");
	}
	
}


