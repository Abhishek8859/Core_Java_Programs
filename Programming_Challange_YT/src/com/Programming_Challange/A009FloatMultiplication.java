package com.Programming_Challange;

import java.util.Scanner;

//Create a program to calculate product of two floating points numbers.

public class A009FloatMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("We are doing Float Multiplication\\n");
		System.out.println("Please enter first decimal number: ");
		double first = sc.nextDouble();
		System.out.println("Now, please enter second number: ");
		double second = sc.nextDouble();
		System.out.println("\n Result is: " + (first * second));

	}

}
