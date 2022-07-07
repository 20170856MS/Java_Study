package com.loop;

import java.util.Scanner;

public class Loop1_ex {

	public static void main(String[] args) {
		// 0~9까지 출력
		
		for (int i = 0; i<10; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("=====================");
		for (int i = 0; i<10; i=i+2) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int dog = sc.nextInt();
		
		for (int i=0; i<dog; i++) {
			System.out.print("멍");
		}

	}

}
