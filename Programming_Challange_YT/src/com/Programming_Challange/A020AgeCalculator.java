package com.Programming_Challange;
//.Create a program that categorize a person into different age groups

//Child -> below 13 Teen -> below 20
//Adult -> below 60 Senior-> above 60

import java.util.Scanner;

public class A020AgeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Age Calculator...");
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		if (age >= 65) {
			System.out.println("You are a Senior Citizen.");
		} else if (age >= 20) {
			System.out.println("You are an adult.");
		} else if (age >= 13) {
			System.out.println("You are a teenager");
		} else {
			System.out.println("You are a child.");
		}

	}

}
