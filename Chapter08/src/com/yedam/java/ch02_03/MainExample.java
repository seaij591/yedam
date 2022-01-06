package com.yedam.java.ch02_03;

public class MainExample {

	public static void main(String[] args) {
		ImplementsC impl = new ImplementsC();
		
		InterpaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();
		ic.methodC();
		
	}

}
