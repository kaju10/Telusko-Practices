package com.kaju.patterns;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int f=1;
		int n=1;
		System.out.print(f + " ");
		System.out.print(n + " ");
		for(int i=1; i<=10; i++) {
			
			
			int nextnum=f+n;
			f=n;
			n=nextnum;
			System.out.print(nextnum + " ");
		}
	}

}
