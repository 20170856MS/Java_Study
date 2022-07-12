package com.array;

public class Array7 {

	public static void main(String[] args) {
		int [] ar = {1, 2 , 3, 4, 5};
		
		for(int i=0; i<ar.length-1;i++) {
			//내림차순
			for(int j = i+1; j<ar.length;j++) {
				int tmp = ar[j];
				ar[j]=ar[i];
				ar[i]=tmp;
			
		}
		
			
		}

	}

}
