package com.Programming_Challange;
//Create a program that determines the greatest of the three numbers.

import java.util.Scanner;

public class A017GreatestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the world of three...\n");
		System.out.println("Please enter first number: ");
		int first = sc.nextInt();
		System.out.println("Please enter second number: ");
		int second = sc.nextInt();
		System.out.println("Please enter third number: ");
		int third = sc.nextInt();
		if (first > second && first > third) {
			System.out.println(first + " is greatest.");
		} else if (second > third) {
			System.out.println(second + " is greatest.");
		} else {
			System.out.println(third + " is greatest.");
		}

	}

}
