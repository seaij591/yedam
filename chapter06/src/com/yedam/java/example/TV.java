package com.yedam.java.example;

public class TV {

	String company ;
	int scine ;
	int size ;
	
	
	TV(String company, int scine, int size){
		this.company = company;
		this.scine = scine;
		this.size = size;
		
	}
	void showInfo() {
		System.out.println(company+"에서 만든"+scine+"년형"+size+"인치 TV");
	}
}
