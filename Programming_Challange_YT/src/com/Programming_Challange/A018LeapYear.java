package com.Programming_Challange;

import java.util.Scanner;

//.Create a program that determines if a given year is a leap year

//(considering conditions like divisible by 4 but not 100, unless also divisible by 400).

public class A018LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the leap year calculator...");
		System.out.println("Enter the value of year: ");
		int year = sc.nextInt();
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Your year is a leap year");
		} else {
			System.out.println("Your year is not a leap year.");
		}

	}

}
