package com.yedam.java.quiz;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		//문제4
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		//문제6
		int value = 356;
		System.out.println((value / 100) * 100);
		System.out.println(value - (value % 100));
		
		//문제8
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom)* height / 2.0;
		System.out.println(area);
		
		//문제9
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 :");
		double firstNum = Double.parseDouble(scanner.nextLine());
		System.out.print("두 번째 수 :");
		double secondNum = Double.parseDouble(scanner.nextLine());
		
		if(secondNum == 0.0) {
			System.out.println("결과 : 무한대");
		}else {
			System.out.println("결과 : " + (firstNum / secondNum));
		}
		
		//문제10
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이 : " + var4);
		
		//문제11
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {//아이디 일치여부
			if(password == 12345) {//비밀번호 일치여부
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}
		
		//문제13
		int val = 0;
		
		//val = val + 10;
		val += 10;
		//val = val - 10;
		val -= 10;
		//val = val * 10;
		val *= 10;
		//val = val / 10;
		val /= 10;
		
		//추가문제) 아래와 같이 각 변수를 초기화하였을 때 각 문제에 맞게 구현하세요.
		int x = 10;
		int y = 10;
		int result;
		
		//1-1) 부호연산자를 이용하여 변수 x의 값을 음수로 출력하세요. 단, 변수 x의 값은 변하지 말아야 한다.
		result = -x;
		//1-2) 변수 x와 y의 값을 더한 후 y의 값을 증가시키는 연산식을 한줄로 작성하여라.
		result = x + y++;
		//1-3) 변수 x와 y의 값을 더한 값이 20이 되도록 변수 x와 y 중 하나의 변수에 증감연산자를 사용하여 연산식을 한줄로 작성하여라.
		result = --x + y;
		result = x + --y;
		//1-4) 변수 x에서 변수 y를 나눈 후 몫과 나머지를 출력하여라.
		System.out.println("몫 : " + (x/y) + ", 나머지 : " + (x%y)); 
	}
}
