package com.string.com;

public class Stringdemo {

	public static void main(String[] args) {

		String s = "welcome";
		String s1="welcome"	;
		String s2="welcome";
		String s3= new String("hello");
		String s5= "hello";
		System.out.println(s==s1);
		System.out.println(s3==s5);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s5));
	}
}