package com.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		//몬스터 생성
		String [] monsterNames = {"고블린", "오크", "트롤","골렘"};
		int [] monsterHps = {5, 7, 10, 15};
		
		//캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름을 입력하세요 : ");
		String name = sc.next();
		
		//파이어볼
		
		
		//몬스터파티 생성
		//몬스터 수 입력(1-4)
		//1. 입력한 수만큼 몬스터를 랜덤하게 뽑고 
		//2. 해당 몬스터의 hp를 뽑아서 출력
		
		
		
		//1회성 공격
		//0~6사이의 랜덤한 데미지로 몬스터를 공격
		boolean check = true;
		int death = 0;
		int run = 0;
		
		while(true) {
			System.out.println("몬스터 수 입력: ");
			int count = sc.nextInt();
			String [] spawn = new String [count];
			int [] spawnHps = new int [count];
			
			for (int i = 0; i<spawn.length;i++ ) {
				int rd = random.nextInt(4);
				spawn [i] = monsterNames[rd];
				spawnHps [i] = monsterHps[rd];
			}
			for (int i = 0; i< count;i++ ) {
				System.out.println(spawn[i]+" : "+spawnHps[i]);
			}
			check = true;
			
			
			while(check) {
				System.out.println("========================================");
				System.out.println("공격을 선택하세요 : 1.파이어볼  2. 도망");
				int magic = sc.nextInt();
				
				if (magic == 1) {
					System.out.println("파이어볼");
					for(int i = 0; i < spawn.length; i++) {
						int magicPower = random.nextInt(6);
						spawnHps[i] = spawnHps[i] - magicPower;
						System.out.println(spawn[i]+"에게"+magicPower+"의 피해를 주었습니다.");
						
					}
					for (int i = 0; i< count;i++ ) {
						if(spawnHps[i]<0) {
							spawnHps[i] = 0;
						}
						System.out.print(spawn[i]+" : "+spawnHps[i]);
						if (spawnHps[i] ==0) {
							System.out.print(" 사망");
						}
						System.out.println();
						
					}
					
					for(int i = 0; i< count;i++) {
						if (spawnHps[i]==0) {
							death = death+1;
						}
						if (death==spawn.length) {
							check = false;
						}
					}
					death = 0;
				}
				else if (magic == 2) {
					System.out.println("도망갔습니다");
					run = 1;
					for (int i = 0; i< count;i++ ) {
						System.out.print(spawn[i]+" : "+spawnHps[i]);
						if (spawnHps[i] ==0) {
							System.out.print(" 사망");
						}
						System.out.println();
						
					}
					break;
				}
				
				
				
			}
			System.out.println("그만하시겠습니까?");
			System.out.println("1: 네   2: 아니요");
			int contin= sc.nextInt();
			if(contin==1) {
				break;
			}
			
			if(run == 1) {
				break;
			}
			
		}
		
	}

}
