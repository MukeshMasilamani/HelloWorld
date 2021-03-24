package org.bike;

public class Remove {
	public static void main(String[] args) {
		
	
	String st = "progoing";

	
	char[] array = st.toCharArray();
	int len = array.length;
	
	
	for (int i = 0; i < len; i++) {
		
		for (int j = i+1; j < len; j++) {
			
			if (array[i] != array[j] ) {
				
				System.out.print(array[i]);
				break;
				
			}
		}
		
	}
	
	
}

}


