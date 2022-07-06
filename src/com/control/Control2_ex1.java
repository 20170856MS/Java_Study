package com.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// 월급을 입력받는다. 1. 정규직 2. 계약직
		// 정규직 - 세금 국민연금1% 건강보함 1.4%  고용보험 0.5%  산재보험 0.7%
		// 계약직 - 3.3%
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월급을 입력합니다.");
		int money = sc.nextInt();
		
		System.out.println("정규직이면 1번, 계약직이면 2번을 누르세요.");
		int number = sc.nextInt();
		
		if (number==1) {
			money = money - money*1/100 - money*14/1000 - money*5/1000 - money*7/1000;
			System.out.println(money+"원 입니다.");
		}else if (number==2) {
			money = money - money*33/1000;
			System.out.println(money+"원 입니다.");
		}else {
			System.out.println("1번과 2번중에서 눌러주세요");
		}
		
	}
}
