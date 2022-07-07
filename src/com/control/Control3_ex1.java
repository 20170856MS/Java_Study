package com.control;

import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//국어 영어 수학 점수 입력, 총점 및 평균 계산
		System.out.println("국어 점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = sc.nextInt();
		int result = kor + eng + math;
		float grade = (float)result/3;
		System.out.println("총점 : "+result+ " 평균 : "+grade);
		if (grade >= 90) {
			System.out.println("A");
		}else if (grade >=80) {
			System.out.println("B");
		}else if (grade >=70) {
			System.out.println("C");
		}else if (grade >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
