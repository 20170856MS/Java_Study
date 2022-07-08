package com.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FPS 탄창 30발 3개
		//1. 단발 2. 점사(3발)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소지한 탄창의 개수");
		int bullet = sc.nextInt();
		for(int i=0;i<bullet;i++) {
			System.out.println("1.단발  2.점사");
			int gun = sc.nextInt();
			
			for(int j=0;j<30;j++) {
				if (gun==1) {
					System.out.print("탕");
				}else if(gun==2) {
					System.out.print("탕탕탕");
					j=j+2;
				}
				System.out.println("");
			}
			if(i !=bullet-1) {
				System.out.println("reloading");
			}
		}
		System.out.println("탄창 전부 소모");
		
		
	}

}
