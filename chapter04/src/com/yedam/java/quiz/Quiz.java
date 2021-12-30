package com.yedam.java.quiz;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int menuNo = Integer.parseInt(scanner.nextLine());
			
			switch(menuNo) {
			case 1://예금
				System.out.print("예금액>");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2://출금
				System.out.print("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3://잔고
				System.out.println("잔고>"+balance);
				break;
			case 4://종료
				run = false;
				break;
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
