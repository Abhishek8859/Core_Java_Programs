package com.Programming_Challange;

import java.util.Scanner;

//Create a program that shows bitwise OR of two numbers.

public class A022BitwiseOr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Showing Bitwise OR...");
		System.out.println("Please enter first number: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number: ");
		int second = sc.nextInt();
		int result = first | second;
		System.out.println("Result is: " + result);

	}
}
