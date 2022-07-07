package com.loop;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("1.대문자, 2.소문자, 3.종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("대문자");
				break;
			case 2:
				System.out.println("대문자");
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				i = 10;
				
			}
		}

	}

}
