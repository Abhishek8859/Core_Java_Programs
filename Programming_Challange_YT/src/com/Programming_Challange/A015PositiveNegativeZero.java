package com.Programming_Challange;
//.Create a program that determines if a number is positive, negative, or zero.

import java.util.Scanner;

public class A015PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to number checker\n");
		System.out.println("Please enter a number: ");
		int num = input.nextInt();
		if (num > 0) {
			System.out.println("Entered number is positive.");
		} else if (num == 0) {
			System.out.println("Entered number is zero.");
		} else {
			System.out.println("Entered number is negative.");
		}
	}

}
