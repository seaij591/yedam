package com.yedam.java.quiz;

import java.util.Scanner;

public class HomeWork1229 {

	public static void main(String[] args) {
		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		//		 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		//		 제1사분면 : x>0, y>0
		//		 제2사분면 : x<0, y>0
		//		 제3사분면 : x<0, y<0
		//		 제4사분면 : x>0, y<0
		//		 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
		
		Scanner ab = new Scanner(System.in);
		int x = 0;
		int y = 0;
		x = Integer.parseInt(ab.nextLine());
		y = Integer.parseInt(ab.nextLine());

		if( x > 0 && y>0) {
			System.out.println("1사분면");
		}else if(x < 0 && y > 0) {
			System.out.println("2사분면");
		}else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		}else if(x > 0 && y < 0){
			System.out.println("4사분면");
		}

		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		//		 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		//		 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며, 
		//		 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		//		 HiNT : 이중 IF문 사용
		//		 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
		Scanner bc = new Scanner(System.in);
		int a;
		 a= Integer.parseInt(bc.nextLine());
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0 ) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
			
		}
		
		
		
		
		
		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록 구현하세요.
		//		 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		Scanner cd = new Scanner(System.in);
		String str = cd.nextLine();
		
		switch(str){
		case "보" :
			System.out.println("이기기 위해선 가위를 내야합니다");break;
		case "가위" :
			System.out.println("이기기 위해선 바위를 내야합니다");break;
		case "바위" :
			System.out.println("이기기 위해선 보를 내야합니다");break;
		default : 
			System.out.println("입력 오류");break;

		}
		
		
		
		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		//		*
		//		**
		//		***
		//		****
		//		*****

		for(int i =1; i<=5 ; i++) {
			for(int j =1 ; j<=i ; j++) {
				System.out.print("*");	
				
			}
			System.out.println();
		}
		
		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 		예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		//				2 X 1 = 2
		//				2 X 2 = 4
		//				2 X 3 = 6 
		Scanner de = new Scanner(System.in);
		
		int m = Integer.parseInt(de.nextLine());
		int n = Integer.parseInt(de.nextLine());
		for(int i=1 ; i<=n ; i++) {
			
			System.out.println(m + "X" + i + "="+ m*i );
		}
		
	}

}
