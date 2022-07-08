package com.loop;

public class Loop5_ex1_1 {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		if(flag) {
			System.out.println("게임을 시작");
			int level=1;
			int gold =1000;
			
			for(level=1; level<15; level++) {
				if(level%5==0) {
					gold = level/5*1000+gold;
				}
				
				for(int mon=0;mon<3*level;mon++) {
					System.out.println(mon+1+"꽥");
				}
				System.out.println("=============");
			}
			
			gold = gold+3000;
			
			System.out.println("최종레벨 : "+level);
			System.out.println("최종Gold : "+gold);
		}
		
		System.out.println("프로그램을 종료합니다.");

	}

}
