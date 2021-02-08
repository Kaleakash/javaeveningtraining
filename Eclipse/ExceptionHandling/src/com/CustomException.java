package com;

class AgeException extends Exception {
	public AgeException() {
			super();
	}
	public AgeException(String msg) {
			super(msg);			// calling super class parametermized constructor
	}
}
public class CustomException {

	public static void main(String[] args) {
		int age=18;
		try {
			//int res = 10/0;
			if(age<21) {
				//throw new Exception();
				//throw new ArithmeticException();
				//throw new ArithmeticException("age must > 21");
				//throw new AgeException();
				throw new AgeException("age must be > 21");
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Finish");
	}

}
