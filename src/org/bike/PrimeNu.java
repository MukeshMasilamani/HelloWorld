package org.bike;

public class PrimeNu {
public static void main(String[] args) {
	
	int no = 16;
	int i = 2; 
	boolean prime = true;
	
	while (i<no)  
	{
		if (no %i==0) {
			System.out.println("Not Prime");
			prime = false;
			
			}
	
		i++;
	}
	if (prime==true) {
		System.out.println("Prime");
	}
}
}
