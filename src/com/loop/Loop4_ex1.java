package com.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		//
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력하세요");
		int min = sc.nextInt();
		System.out.println("초를 입력하세요");
		int sec = sc.nextInt();
		boolean ring = false;
		
		for(int i=0;i<60;i++) {
			for(int j=0;j<60;j++) {
				System.out.println(i+"분"+j+"초");
				if (min==i && sec==j) {
					ring = !ring;
					break;
				}
			}
			if (min==i && ring==true) {
				break;
			}
			
		}
		System.out.println("알람");

	}

}
