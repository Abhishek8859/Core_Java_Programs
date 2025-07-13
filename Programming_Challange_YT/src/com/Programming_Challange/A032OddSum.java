package com.Programming_Challange;

import java.util.Scanner;

public class A032OddSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome in the World of Odd numbers sum...");
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = oddSum(num);
		System.out.println("Sum of Odd number : " + sum);
	}

	public static int oddSum(int num) {
		int sum = 0;
		int i = 1;
		while (i <= num) {
			sum += i;
			i += 2;
		}
		return sum;

	}

}
