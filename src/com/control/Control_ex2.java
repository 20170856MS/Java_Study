package com.control;

import java.util.Scanner;

public class Control_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int number = sc.nextInt();
		String kor = "홀수";
		
		if (number%2 ==0) {
			kor = "짝수";
		} // kor = num % 2 == 0 ? "짝수" : "홀수" ;

		System.out.println(kor+"입니다.");
		
	}

}
