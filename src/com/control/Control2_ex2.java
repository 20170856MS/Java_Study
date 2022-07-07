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
	
		/* 소문자가 범위를 벗어났을 때
		 * int result = ch + num;
		 * if(result > 'z'){
		 * 		result = result - 'z'-1;
		 * 		result = 'a' + result;
		 * }
		 * 대문자가 범위를 벗어났을 떄
		 * 
		 * int result = ch + num;
		 * if result > 'Z' && result < 'a'){
		 * 		result = result - 'Z'-1;
		 * 		result 'A' + result;
		 * }
		 * ch = (char)result;
		 * */
		
		System.out.println(alpabet);
		System.out.println("Home Edition");
	}
}