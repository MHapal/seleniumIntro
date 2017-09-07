package com.softserve.edu;

public class Appl {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Calc calc = new Calc();
		System.out.println("1+1= " + calc.add(1, 1));
		System.out.println("10/5= " + calc.div(10, 5));
	}

}
