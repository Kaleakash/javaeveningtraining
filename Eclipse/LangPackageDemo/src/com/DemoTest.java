package com;

public class DemoTest {

	public static void main(String[] args) {
	/*String s1 = "Raj";				// literal style
	String s2 = new String("Raj");	// new keyword 
	String s3 = "Raj";				// string pooling 
	String s4 = new String("Raj");
	/*if(s1.equals(s4)) {
		System.out.println("Equal");
	}else {
		System.out.println("Not Equal");
	}
	
	System.out.println(s1);
	//System.out.println(s1.toUpperCase());
	s1 = s1.toLowerCase();
	System.out.println(s1);
	*/
		StringBuffer sb = new StringBuffer("Raj");
		System.out.println(sb);
		System.out.println(sb.append(" Deep"));
		System.out.println(sb);
	}

}
