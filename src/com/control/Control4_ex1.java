package com.control;

import java.util.Scanner;

public class Control4_ex1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//국어 영어 수학 점수 입력, 총점 및 평균 계산
		System.out.println("국어 점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = sc.nextInt();
		int result = kor + eng + math;
		int grade = (int)result/3;
		System.out.println("총점 : "+result+ " 평균 : "+grade);
		
		switch (grade/10) {
			case 10:	
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
			
		}
		
		
	}
}
