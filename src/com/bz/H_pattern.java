package com.bz;

public class H_pattern {
public static void main(String[] args) {
	
	for(int i=0; i<=12; i++) {
		for (int j=0; j<=12; j++) {
			if(j==0 || j==12 || i==5) 
				System.out.print("*");
			else
				System.out.print(" ");
			
		}
		System.out.println();
	}
		
		
}
}

	
		
	
	

