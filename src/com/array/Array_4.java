package com.array;

import java.util.Scanner;

public class Array_4 {
	public static void main (String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int [] nums = new int [4];
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(i+"번 인덱스값을 입력하세요");
			nums [i] = sc.nextInt();
			
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(i+"번째 인덱스값 : "+nums[i]);
		}
	}
}
