package com.yedam.java.quiz;

public class test1230 {

	public static void main(String[] args) {

		// 문제 1번
		int a = 10;
		double b = 2.0;
		int c = (int) b;
		System.out.println(a + c);
		System.out.println(a - c);
		System.out.println(a * c);
		System.out.println(a / c);
		System.out.println(a % c);

		// 문제2

		int num1 = 10;
		int num2 = 20;
		boolean result;

		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result);
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result);
		System.out.println(!result);

		// 문제3
		int num3 = 10;
		int num4 = 2;
		char operator = '-';

		switch (operator) {
		case '+':
			System.out.println(num3 + num4);
			break;
		case '-':
			System.out.println(num3 - num4);
			break;
		case '*':
			System.out.println(num3 * num4);
			break;
		case '/':
			System.out.println(num3 / num4);
			break;
		}
		// 문제4

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i > j) {
					continue;
				}
				System.out.println(i + "x" + j + "=" + i * j);
			}

		}

	}

}
