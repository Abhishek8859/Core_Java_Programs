package com.Programming_Challange;

import java.util.Scanner;

public class A006Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Sum Calculator!!");
		System.out.println("Please enter first number: ");
		int firstNumber = sc.nextInt();
		System.out.println("Please enter second number: ");
		int secondNumber = sc.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.println("Sum of your number: " + sum);
	}

}
