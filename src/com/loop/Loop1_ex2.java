package com.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		// 1번이면 대문자, 2번이면 소문자   1번 A-Z 2번 a-z
		
		// 1-10 까지의 합 구하기
		
		//yID = 1234 yPw= 5678   id pw입력 받아 로그인 판단, 5회 이상이면 블록
		Scanner sc = new Scanner(System.in);
		
		//1
		System.out.println("1. 대문자, 2. 소문자");
		int eng = sc.nextInt();
		if (eng == 1) {
			for (int i=65; i<91; i++) {
				System.out.print((char)i+" ");
				
			}
		}else if (eng == 2) {
			for (int i=97; i<123; i++) {
				System.out.print((char)i+" ");
		}
			}else {
			System.out.println("1번과 2번을 선택하세요");
		}
		
		//2
		int sum = 0;
		for (int i=0; i<11; i++) {
			sum = sum + i;
		}
		System.out.println("");
		System.out.println(sum);
		
		//3
		int yId = 1234;
		int yPw = 5678;
		int login = 0;
		for (int i=0 ; i<5; i++) {
			System.out.println("아이디를 입력하세요 : ");
			int Id = sc.nextInt();
			System.out.println("비밀번호를 입력하세요 : ");
			int Pw = sc.nextInt();
			
			if (yId != Id) {
				System.out.println("아이디를 틀렸습니다.");
			}
			if (yPw != Pw) {
				System.out.println("비밀번호가 틀렸습니다.");
				
			}
			if(yId != Id || yPw != Pw ) {
				if(i ==4) {
					System.out.println("5회이상 틀렸습니다.");
					login = 1;
					}
			}
			if (yId == Id && yPw == Pw) {
				System.out.println("로그인 되었습니다.");
				i = 5; login = 2; //break;
			}
		
		}
		if (login == 1) {
			System.out.println("로그인 실패");
		}else if (login == 2) {
			System.out.println("로그인 성공");
		}
		
		/* for(int count=0; count<5; count++){
		 * System.out.println("ID 입력");
		 * int id= sc.nextInt();
		 * System.out.println("PW 입력");
		 * int pw= sc.nextInt();
		 * if(id ==yId&&pw==yPw){
		 * System.out.println("로그인성공")
		 *  count = 100;}
		 * else{ System.out.println("로그인실패");}
		 * */
		
		// boolean check = false;
		// check = !check; => true
	}

}  