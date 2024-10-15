package com;

class Emp{                                  // Inheritance   multiple inheritance is not allowed 
	int salary = 1500;                      // extends keyword is used.
	public void increament() {
		System.out.println("Increament in salary is 1000");
	}
}

class Eng extends Emp{
	int benefit = 1000;
}

public class TestDemo {

	public static void main(String[] args) {
             Eng eng = new Eng();
             System.out.println("Salary: "+eng.salary + "  Benefits: "+ eng.benefit );
             eng.increament();
	}

}
