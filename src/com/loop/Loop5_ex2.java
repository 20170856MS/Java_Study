package com.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		Random random = new Random();
//		nextInt(정수) : 0부터 입력한 정수 미만의 범위세어 무작위 정수를 추출
//		int num = random.nextInt(10);
//		System.out.println(num);
		
		//가위바위보   0:갸위 1:바위 2:보
		
		int win=0; int draw = 0; int lose= 0;
		while(true) {
			System.out.println("=================");
			System.out.println("0:가위 1:바위 2:보");
			System.out.println("가위바위보 : ");
			int num = sc.nextInt();
			int num2 = random.nextInt(3);
			
			if(num==0) {
				if(num2==0) {
					System.out.println("비겼습니다.");
					draw = draw+1;
				}else if(num2==1) {
					System.out.println("졌습니다.");
					lose = lose +1;
				}else if(num2==2) {
					System.out.println("이겼습니다.");
					win = win+1;
					break;
				}
			}else if(num==1) {
				if(num2==0) {
					System.out.println("이겼습니다.");
					win = win+1;
					break;
				}else if(num2==1) {
					System.out.println("비겼습니다.");
					draw = draw+1;
				}else if(num2==2) {
					System.out.println("졌습니다.");
					lose = lose +1;
				}
			}else if(num==2) {
				if(num2==0) {
					System.out.println("졌습니다.");
					lose = lose +1;
				}else if(num2==1) {
					System.out.println("이겼습니다.");
					win = win+1;
					break;
				}else if(num2==2) {
					System.out.println("비겼습니다.");
					draw = draw+1;
				}
			}
		}
		System.out.println("당신이 이겼습니다.   무승부 :"+draw+" 패 :"+lose);
		//if(com==0 && you ==2){you=-1;}
		//if(com==2 && you ==2){com=-1;}
		//if(com<you){win}
		//else if(com==you){draw}
		//else { com win}
	}
}
