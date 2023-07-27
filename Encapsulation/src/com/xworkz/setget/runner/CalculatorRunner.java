package com.xworkz.setget.runner;

import com.xworkz.setget.app.Calculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		
		Calculator calculator = new Calculator();
		System.out.println(calculator);

		calculator.setName("Calculator");
		calculator.setCompanyName("Casio");
		calculator.setType("Scientific");
		calculator.setSolarPannel(true);
		calculator.setCost(100);

		System.out.println(calculator);
	}


}
