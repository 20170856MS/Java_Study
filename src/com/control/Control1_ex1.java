package com.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		//키보드로부터 국어점수 영어점수 수학점수를 차례로 입력받아, 총점과 평균 계산
		//평균이 90점 이상이면 우등상 출력 
		
		//평균이 90점 이상이면 a출력 , 80점 이상이면 b출력, 70점 이상이면 c출력 60점 d, 그외 나며지 f
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		double exam = (kor+eng+math)/3;
		System.out.println("총점 : "+(kor+eng+math)+" 평균 : " + exam);
		if (exam >=90) {
			System.out.println("우등상 수상");
		}
		System.out.println("졸업");
		
		
		
		if (exam >=90) {
			System.out.println("A학점");
		}
		if (exam >= 80 && exam < 90) {
			System.out.println("B학점");
		}
		if (exam >= 70 && exam < 80) {
			System.out.println("C학점");
		}
		if (exam >= 60 && exam < 70) {
			System.out.println("D학점");
		}
		if (exam <60){
			System.out.println("F학점");
		}
	}

}
