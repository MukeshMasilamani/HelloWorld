package org.bike;

public class Reverse {
	public static void main(String[] args) {

		String s = "Java";
		
		int len = s.length();
		
		for (int i = len-1; i >= 0; i--) {
			
			char c = s.charAt(i);
			System.out.print(c);
		}
		
    }
}

