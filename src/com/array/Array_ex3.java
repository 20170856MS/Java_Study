package com.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		// 학교 성적 프로그램
		//1. 학생 정보 입력 - 학생 수를 입력(이름, 번호, 국어, 영어, 수학 입력 + 총점 평균 계산 후 입력)
		//2. 학생 정보 조회 - 모든 학생의 이름, 번호, 총점, 평균 출력
		//3. 학생 정보 검색 - 검색할 학생의 번호를 입력 - 입력한 번호와 일치하는 학생의 모든 정보 출력 출력 - 없으면 "없는 번호입니다" 출력
		//4. 학생 정보 삭제 - 삭제할 학생의 번호 입력 - 입력한 번호와 일치하는 학생의 모든 정보 삭제(배열 한칸 삭제) - 없으면 "없는 번호입니다" 출력
		//5. 학생 정보 추가 - 이름, 번호, 국어, 영어, 수학, 총점, 평균 추가
		//6. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1.학생정보입력 2.학생정보조회 3.학생정보검색 4.학생정보삭제 5. 학생정보추가 6.프로그램종료");
			int menu = sc.nextInt();
			int student=0;
			String [] names = null;
			int [] nums = null;
			int [] kors = null;
			int [] engs = null;
			int [] maths = null;
			int [] totals = null;
			int [] avgs = null;
			
			
			if(menu ==1) {
				System.out.println("학생 수를 입력하세요.");
				student = sc.nextInt();
				
				
				for(int i=0; i< student; i++) {
					System.out.println("학생의 이름을 입력하세요.");
					names[i] = sc.next(); 
					System.out.println("학생의 번호를 입력하세요.");
					nums[i] = sc.nextInt();
					System.out.println("학생의 국어점수를 입력하세요.");
					kors[i] = sc.nextInt();
					System.out.println("학생의 영어점수를 입력하세요.");
					engs[i]= sc.nextInt();
					System.out.println("학생의 수학점수를 입력하세요.");
					maths[i] = sc.nextInt();
					totals[i] = kors[i]+engs[i]+maths[i];
					avgs[i] = totals[i]/3;
					
				}
				System.out.println("============입력 끝============");
			}else if(menu ==2) {
				System.out.println("이름\t번호\t총합\t평균\t");
				for(int i=0;i<student;i++) {
					System.out.println(names[i]+ "\t"+nums[i]+ "\t"+totals[i]+"\t"+avgs[i] );
				}
			}
			else if(menu ==3) {
				System.out.println("검색할 학생의 번호를 입력하세요. :");
				int select = sc.nextInt();
				boolean flag = true;
				for(int i=0;i<student;i++) {
					if(select == nums[i]) {
						System.out.println("이름\t번호\t국어\t영어\t수학\t총합\t평균\t");
						System.out.println(names[i]+ "\t"+nums[i]+"\t"+kors[i]+"\t"+engs[i]+"\t"+maths[i]+"\t"+totals[i]+"\t"+avgs[i] );
						flag = false;
						break;
					}
				}if(flag != false) {
					System.out.println("일치하는 결과가 없습니다.");
				}
			}
			else if(menu ==4) {
	
			}
			else if(menu ==5) {
	
			}
			else if(menu ==6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("없는 번호입니다.");
			}
		}
	}
}