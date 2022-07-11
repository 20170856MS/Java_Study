package com.array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		//변수선언공식 => 테이터타입 변수명;
		//String name;
		//Scanner sc;
		
		//배열선언: 모을려고 하는 데이터 타입 [] 변수명
		
		int age = 30;
		int [] nums = new int[3];
		char [] names = new char[2];
		
		nums[0] = 10;
		nums[1] = age;
		nums[2] = 50;
		
		System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		names [0] = 'a';
		names [1] = 'b';
		
		System.out.println(names[0]);
		System.out.println(names[1]);
	}

}
