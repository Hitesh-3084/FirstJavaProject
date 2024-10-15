package com.enc;

// Encapsulation : wrapping of data and functions in a unit.
// Provides security

public class Test {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStdId(101);
		student.setStdName("Chadnan");
		student.setStdAge(25);
		student.setStdRoll(121);

		System.out.println("Student Id : " + student.getStdId() + " Student Name :" + student.getStdName()
				+ " Student age : " + student.getStdAge() + " Student Roll " + student.getStdRoll());

	}

}