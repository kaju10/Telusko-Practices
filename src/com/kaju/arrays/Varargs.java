package com.kaju.arrays;

public class Varargs {
	
	public static void main(String[] args) {
		
		Test obj = new Test();
		
		
		// we ccan put any number of input we want
		obj.show(4,5,6,7);
		
	}

}


class Test{
	
	// ... is used to take as many inputs and it takes them as array
	public void show(int ... a) {
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}