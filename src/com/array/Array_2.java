package com.array;

import java.util.Scanner;

public class Array_2 {
	public static void main(String [] args) {
		//배열은 어떤 데이터타입이든 상관 x
		
		String [] names = new String [3] ;
		names [0] = "iu";
		names [1] = "choa";
		names [2] = "suji";
		
		int [] nums = new int [3];
		System.out.println(nums[0]);
		
		Scanner [] sc = new Scanner[2];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int [] nums2 = nums;
		
		System.out.println(nums2[0]);
		
		
		
	}

}
