package com;

public class TryWithMultipleCathBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a=10;
		int b=0;
		String str = "a10";
		int abc[]= {10,20,30,40};
		try {
		int res = a/b;			// 10/0
		System.out.println("Result is "+res);
		int res1 = 10/abc[1];
		System.out.println("REs "+res1);
		int res2 = Integer.parseInt(str);		//converting string to int
		System.out.println("Res "+res2);
		}catch (ArithmeticException e) {
			System.out.println("Divided by Zero "+e.toString());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array "+e.toString());
		}
		System.out.println("bye");
		System.out.println("bye");
	}

}
