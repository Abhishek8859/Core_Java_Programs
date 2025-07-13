package com.Programming_Challange;

import java.util.Scanner;

public class A031SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Sum of Digits:");
		System.out.println("Please enter your number:");
		int num = sc.nextInt();
		int sum = sumOfDigits(num);
		System.out.println("Sum of digits: " + sum);
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

}
