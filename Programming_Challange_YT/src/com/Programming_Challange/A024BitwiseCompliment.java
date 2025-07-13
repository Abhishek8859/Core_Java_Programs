package com.Programming_Challange;

import java.util.Scanner;

public class A024BitwiseCompliment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to showcase of Not/Compliment Operator\n");
		System.out.print("Please enter your number");
		int num = input.nextInt();

		int result = ~num;
		System.out.println("Your result is: " + result);
	}

}
