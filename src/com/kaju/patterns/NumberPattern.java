package com.kaju.patterns;


//my process
//public class NumberPattern {
//	public static void main(String[] args) {
//		for(int i=1; i<=4; i++) {
//			
//			for(int j=i; j<=4; j++) {
//				
//					System.out.print(j);
//					
//			}
//			for(int k=1;k<i; k++) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
//	}
//
//}




//telusko process
public class NumberPattern {
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1; j<=4; j++) {
				int k=i+j-1;
				if(k>4) {
					System.out.print(k-4);
				}
				else {
					System.out.print(k);
				}
			}
			System.out.println();
		}
		
	}
}	