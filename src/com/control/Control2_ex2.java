package com.control;

import java.util.Scanner;

public class Control2_ex2 {
	public static void main(String [] args) {
		//
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int number = sc.nextInt();
		System.out.println("알파벳을 입력하세요");
		char alpabet = sc.next().charAt(0);
		int lock = (int)alpabet;
		
		if (lock <= 122-number && lock > 96) {
			lock = lock + number;
			alpabet = (char)lock;
		}else if(lock <90-number) {
			lock = lock + number;
			alpabet = (char)lock;
		}else if(lock >90-number && lock < 96) {
			lock = lock -26 + number;
			alpabet = (char)lock;
		}else if (lock > 122-number) {
			lock = lock -26 + number;
			alpabet = (char)lock;
		}
		
	
		System.out.println(alpabet);
	}
}
