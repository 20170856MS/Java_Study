package com.control;

import java.util.Scanner;

public class Control2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 3;
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
}
