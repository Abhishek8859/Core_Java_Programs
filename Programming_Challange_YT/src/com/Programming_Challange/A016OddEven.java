package com.Programming_Challange;

import java.util.Scanner;

//.Create a program that determines if a number is odd or even

public class A016OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Odd Even Calculator...\n");
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Entered number is Even.");
		} else {
			System.out.println("Entered number is Odd.");
		}
	}

}
