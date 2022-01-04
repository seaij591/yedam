package com.yedam.java.example;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {
		//문제1 Calculator 클래스 -> 사칙연산에 대한 메서드
		
		Calculator myCalc = new Calculator();
		
		myCalc.plus(3,  4);
		int plus = myCalc.plus(3,  4);
		System.out.println("plus : "+ plus);
		
		myCalc.minus(3, 4);
		int minus = myCalc.minus(3, 4);
		System.out.println("minus : "+ minus);
		
		myCalc.minus(3, 4);
		double multy = myCalc.multy(3, 4);
		System.out.println("multy : "+ multy);
		
		myCalc.minus(3, 4);
		double divide = myCalc.divide(3, 4);
		System.out.println("divide : "+ divide);
		
		
		
		//문제2 TV클래스 -> 다음과 같은 형태의 생성자와 메서드를 가진다.
		TV myTv = new TV("LG", 2017, 32);
		myTv.showInfo(); //LG에서 만든 2017년형 32인치 TV
		
		
		//문제3 Grade 클래스 -> 3과목의 점수를 입력받아 성적평균을 출력한다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Gread myGrade = new Gread(math, science, english);
		//average() 메서드는 평균을 계산하여 리턴
		System.out.println("평균 : " + myGrade.average());
	}

}
