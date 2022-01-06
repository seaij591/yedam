package com.yedam.java.ch0604;

public class MainExample {
	//필드
	String message;
	
	//메서드
	void printin() {
		System.out.println(this.message);
	}
	
	public static void main(String[] args) {
		
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
		
		System.out.println();
		
		double result1 = 10*10* Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println();
		//println();
		MainExample main= new MainExample();
		main.message = "정적 메서드 선언 시 주의할 점입니다.";
		main.printin();
		
		//Singleton.singleton = null;
		
		Singleton odj1 = Singleton.getInstance();
		Singleton odj2 = Singleton.getInstance();
		
		if(odj1 == odj2) {
			System.out.println("같은 singleton 객체 입니다.");
		}else {
			System.out.println("다른 singleton 객체 입니다.");
			
		}
		
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";
		//p1.ssn = "654321-7654321";
		p1.name = "홍상원";
		
		System.out.println("지구의 반지름 : " + Earth.EARTH_AREA + "km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_RADIUS + "km^2");
	}

}
