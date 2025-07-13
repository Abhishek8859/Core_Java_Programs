package com.Programming_Challange;

import java.util.Scanner;

public class A030Factorial {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Welcome to Factorial");
		System.out.print("Please enter your number: ");
		int num = inp.nextInt();
		long fact = factorial(num);
		System.out.println("Factorial: " + fact);
	}

	public static long factorial(int num) {
		if (num < 2) {
			return 1;
		}
		long fact = 1;
		int i = 2;
		while (i <= num) {
			fact *= i;
			i++;
		}
		return fact;
	}
}
