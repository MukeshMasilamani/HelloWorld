package org.bike;

public class SortingOrder {

	public static void main(String[] args) {
		
		String st = "java";
		
		char store ;
		
		char[] array = st.toCharArray();
		int len = array.length;
		
		
		for (int i = 0; i < len; i++) {
			
			for (int j = i+1; j < len; j++) {
				
				if (array[i] > array[j] ) {
					
					store = array[i];
					array [i] = array[j];
					array [j] = store;
						
				}
			}
			
		}
		
		System.out.println(array);
	}

}


