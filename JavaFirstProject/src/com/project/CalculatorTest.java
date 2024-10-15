package com.project;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.println("Enter First Number: ");
		double num1 = sc.nextDouble();
		calculator.setNumber1(num1);
		
		System.out.println("Enter Second Number: ");
		double num2 = sc.nextDouble();
		calculator.setNumber2(num2);
		
		System.out.println("Choose a number");
		System.out.println("1. Add Sum");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		double result;
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			result = calculator.add();
			System.out.println("Result sum "+result);
			break;
			
		case 2:
			result = calculator.sub();
			System.out.println("Result Sub "+result);
			break;
			
		case 3:
			result = calculator.mul();
			System.out.println("Result multiplication "+result);
			break;
			
		case 4:
			result = calculator.div();
				System.out.println("Result division "+result);
				break;
			
		default:
			System.out.println("Invalid choice..");
			break;
			
		}
  }

}
