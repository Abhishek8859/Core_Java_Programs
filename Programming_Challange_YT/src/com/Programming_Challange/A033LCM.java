package com.Programming_Challange;

import java.util.Scanner;

public class A033LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to LCM...");
		System.out.println("Please enter your number: ");
		int first = sc.nextInt();
		System.out.println("Please enter your number: ");
		int second = sc.nextInt();
		int lcm = lcm(first, second);
		System.out.println("LCM of the two numbers is: " + lcm);

	}

	public static int lcm(int first, int second) {
		int i = 1;
		while (true) {
			int factor = first * i;
			if (factor % second == 0) {
				return factor;
			}
			i++;
		}

	}

}