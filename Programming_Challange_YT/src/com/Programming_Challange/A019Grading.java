package com.Programming_Challange;
//Create a program that calculates grades based on marks

//A -> above 90% B -> above 75%
//C -> above 60% D -> above 30%
//F -> below 30%

import java.util.Scanner;

public class A019Grading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Grade Calculator...");
		System.out.println("Enter the value of percentage: ");
		float percentage = sc.nextFloat();
		if (percentage >= 90) {
			System.out.println("Great, You have got A.");
		} else if (percentage >= 75) {
			System.out.println("Good, You got B.");
		} else if (percentage >= 60) {
			System.out.println("You have got C, Work harder next time.");
		} else if (percentage >= 30) {
			System.out.println("You have got D, You seriously need to work harder.");
		} else {
			System.out.println("Sorry, You have failed the test and got a F.");
		}

	}

}
