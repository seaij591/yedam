package com.yedam.java.ch0402;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// 문제1) 책 161페이지 5번, for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요.
		// *
		// **
		// ***
		// ****
		// *****
		
		String tree = "";
		for(int i=1; i<=5; i++) {
			//tree = tree + "*";
			tree += "*";
			System.out.println(tree);
		}

		// 문제2) 책 160페이지 2번, for문을 이용해서 1부터 100까지의 정수 중에서 2의 배수가 아닌 숫자의 개수를 구하세요.
		//		 단, continue 문을 사용한다.
		
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				continue;
			}
			//count = count + 1;
			//count += 1;
			count++;
		}
		System.out.println(count);

		// 문제3) 책 161페이지 4번, 중첩 for문을 이용하여 방정식 4x+5y = 60의 모든 해 중 첫번째로 구해지는 값을 (x, y) 형태로 출력해보세요.
		//       단, x와 y는 10이하의 자연수입니다.
		
		Outter : for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x+5*y == 60) {
					System.out.printf("( %d, %d )\n", x, y);
					break Outter;
				}
					
			}
		}
		
		// 문제4) do ~ while문과 Math.random()함수를 이용하여 1 ~ 10의 정수 중 7이라는 수가 나올때까지 숫자를 출력하는 코드를 작성해보세요.
		int value = 0;
		do {
			value = (int)(Math.random() * 10) + 1;
			System.out.println(value);
		}while(value != 7);
		
		// 문제5) 책 161페이지 3번, while문과 Math.random() 함수를 이용해서 2개의 주사위를 던졌을때 나오는 숫자를 (숫자1, 숫자2) 형태로 출력하고,
		//		 숫자의 합이 5가 아니면 계속 주사위를 던지고, 숫자의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		//		 또한 주사위를 몇번 던졌는지 횟수를 출력하세요.
		//		 숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3),(3,2)
				
		int totalCount = 0;
		while(true) {
			//두개의 숫자 -> 주사위를 던진 랜덤한 값
			int x = (int)(Math.random()*6) + 1;
			int y = (int)(Math.random()*6) + 1;
			totalCount++;
			//두개의 숫자를 더한 값이 5가 아닐 경우에만 반복
			int result = x + y;
			if(result == 5) {
				System.out.printf("(%d , %d)\n", x, y);
				System.out.println("주사위를 던진 횟수 : " + totalCount);
				break;
			}
		}

	}

}
