package com.Programming_Challange;

import java.util.Scanner;

public class A028MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Multiplication Table/n");
		System.out.println("Please enter your number: ");
		int num = sc.nextInt();
		printMultiplicationTable(num);

	}

	public static void printMultiplicationTable(int num) {
		int i = 1;
		while (i <= 10) {
			System.out.println(num + " * " + i + " = " + (num * i));
			i++;
		}
	}

}
