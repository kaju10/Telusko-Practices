package com.kaju.inheritance;

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		A obj1 = new A(10);
		obj1.show(10);
		B obj = new B(10);
		obj.show(10);
		A obj2 = new B(10);
		obj2.show(10);;;;; //this gives no error
		
	}

}

class A{
	
	A(int n){
		System.out.println("In class A " + n);
	}
	
	public void show(int n) {
		System.out.println("In Class A show " + n);
	}
	
	A(){
		System.out.println("In class A non param constructor");
	}
	
}


class B extends A{
	
	
	B(int n){
		//if we call super then only the parameterized constructor of A gets called
		//and if we ommit super then always the default constructor gets called
//		super(n);
		System.out.println("In class B " + n);
	}
	
	public void show(int n) {
		System.out.println("In Class B show " + n);
	}
	
	B(){
		
		System.out.println("In class B non param constructor");
	}
	
}
