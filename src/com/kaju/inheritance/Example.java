package com.kaju.inheritance;

public class Example {
	
	public static void main(String[] args) {
		
		GrandSon obj= new GrandSon();
		obj.i=1000;
		obj.j=2000;
		obj.k=3000;
		obj.property1();
		obj.property2();
		obj.property3();
		obj.totalProperty();
	}
	

}

class Father{
	
	int i;
	
	public void property1() {
		System.out.println("Father's property is " + i);
	}
	
	public void totalProperty() {
		System.out.println("Combined property of father is " + i);
	}
		
}

class Son extends Father{
	int j;
	 
	 
	 public void property2() {
		 System.out.println("Son's property is " + j);
	 }
	 
	 public void totalProperty() {
			System.out.println("Combined property of father and son is " + (i+j));
		}
}


class GrandSon extends Son{
	int k;
	public void property3() {
		 System.out.println("Grandson's property is " + k);
	 }
	 
	 public void totalProperty() {
			System.out.println("Combined property of father,son and grandson is " + (i+j+k));
		}
}

