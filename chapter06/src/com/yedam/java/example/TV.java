package com.yedam.java.example;

public class TV {
	//필드
	String company ;
	int scine ;
	int size ;
	
	//생성자
	TV(String company, int scine, int size){
		this.company = company;
		this.scine = scine;
		this.size = size;
		
	}
	//메서드
	void showInfo() {
		System.out.println(company+"에서 만든"+scine
						+"년형"+size+"인치 TV");
	}
}
