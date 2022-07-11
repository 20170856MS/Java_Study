package com.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// 키보드로부터 인원수를 입력 받아서
		// 인원수 많큼 입력 받아서 이름을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수를 입력하세요 :");
		int p = sc.nextInt();
		String [] nums = new String [p];
		
		for(int i = 0; i<nums.length; i++) {
			System.out.print(i+1+"번 이름을 입력하세요 : ");
			nums[i] = sc.next();
		}
		for(int i = 0; i<nums.length; i++) {
			System.out.println(i+1+"번째 이름 : "+nums[i]);
		}
		
		//각 학생의 이름별로 국어점수 입력 후 출력
		
		int [] kor = new int [p];
		for(int i = 0; i<nums.length; i++) {
			System.out.print(nums[i]+"의 국어점수를 입력하세요 : ");
			kor[i] = sc.nextInt();
		}
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]+"의 국어점수 : "+kor[i]);
		}
		
		//반의 국어 총점을 계산하고 출력
		
		int cal = 0;
		for(int i = 0; i<nums.length; i++) {
			cal = cal + kor[i];
		}
		System.out.println("국어 총점 : "+ cal);

	}

}
