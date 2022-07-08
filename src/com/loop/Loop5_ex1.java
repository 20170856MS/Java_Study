package com.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yId=1234;
		int yPd=4567;
		boolean check = true;
		boolean login = false;
		int gold = 0;
		while (check) {
			System.out.println("로그인 시도 1.O 2.X");
			int i = sc.nextInt();
			if (i==1) {
				System.out.println("========================");
			}else if (i==2) {
				System.out.println("종료합니다");
				check=false;
				break;
			}
			System.out.println("아이디 입력 :");
			int id = sc.nextInt();
			System.out.println("비밀번호 입력 :");
			int pw = sc.nextInt();
			
			if (id==yId && pw == yPd) {
				System.out.println("로그인 성공");
				check = false;
				login = true;
			}else {
				System.out.println("로그인 실패");
			}
		}
		// 로그인을 안했으면 프로그램 종료, 로그인에 성공하면 게임 시작
		if (login == false) {
			System.out.println("프로그램 종료");
		}else if(login == true) {
			System.out.println("게임시작");
			int level =1;
			int exp = 0;
			int needexp = 3;
			while(login == true) {
				System.out.println("사냥시작 : 1, 사냥종료 : 2");
				int hunt = sc.nextInt();
				if (hunt == 1) {
					exp = exp+3;
					System.out.println("현재 레벨 : "+level +"  경험치 : "+exp+"/"+needexp+" 소지중인 골드 : " + gold);
				}else if (hunt == 2) {
					System.out.println("사냥종료");
					System.out.println("현재 레벨 : "+ level);
					System.out.println("경험치 : "+exp+"/"+needexp);
					System.out.println("소지중인 골드 :" + gold);
					break;
				}
				if (exp == needexp) {
					System.out.println("=======레벨업=======");
					level = level+1;
					exp = 0;
					needexp = needexp +3;
				}
				if (level == 5 && exp ==0) {
					System.out.println("**5레벨 달성**");
					gold = gold +1000;
				}
				if (level == 10 && exp ==0) {
					System.out.println("**10레벨 달성**");
					gold = gold +2000;
				}
				if (level == 15 && exp ==0) {
					System.out.println("**15레벨 달성**");
					gold = gold +3000;
					System.out.println("만렙달성");
					break;
				}
				
			}
			
		}

	}

}
