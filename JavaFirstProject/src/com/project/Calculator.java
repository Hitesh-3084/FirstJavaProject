package com.project;

public class Calculator {
	
	private double number1;
	private double number2;
	
	
	public double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	
	public double add() {
		return number1 + number2;
	}
	
	public double sub() {
		return number1 - number2;
	}
	
	public double mul() {
		return number1*number2;
	}
	
	public double div() {
		if(number2!=0) {
			return number1/number2;
		}else {
			return -1;
		}
	}

}
