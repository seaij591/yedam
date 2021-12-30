package com.yedam.java.quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 문제9
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int result = (int)(var1 + var2 + (int)var3 + Double.parseDouble(var4));
		System.out.println(result);
		
		//문제11
		byte value1 = Byte.parseByte("10");
		int Value2 = Integer.parseInt("1000");
		float value3 = Float.parseFloat("20.5");
		double value4 = Double.parseDouble("3.14159");
			
		//문제1
		String name = "김자바";
		int age = 25;
		String tel1 = "010", tel2 ="123", tel3="4567";
		System.out.println("이름: "+name);
		System.out.print("나이: "+age+"\n");
		System.out.printf("전화: %s-%s-%s\n", tel1, tel2, tel3);
		
		//문제2
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수 : ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result1 = num1 + num2;
		System.out.println("덧셈 결과 : " + result1);
		
		//문제3
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String strName = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String strSsn = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String strPhone = scanner.nextLine();
		
		
		System.out.println();
		
		System.out.println("[입력한 내용]");
		System.out.println(strName);
		System.out.println(strSsn);
		System.out.println(strPhone);
		
		
		
		
		
		
		
	}
}
