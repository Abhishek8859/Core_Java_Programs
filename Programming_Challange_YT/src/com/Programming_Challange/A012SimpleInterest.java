package com.Programming_Challange;

import java.util.Scanner;

//Create a program to calculate simple interest.
//Simple Interest = (P x T x R

public class A012SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Simple Interest Calculator...");
		System.out.println("Please enter your principle amount Rs: ");
		int principle = sc.nextInt();
		System.out.println("Now, Tell me your rate of interest: ");
		float rate = sc.nextFloat();
		System.out.println("Now, tell me for how many years are you borrowing this money: ");
		float years = sc.nextFloat();
		float interest = (principle * rate * years) / 100;
		System.out.println("\n\n Your Simple interest is Rs: " + interest);
	}

}
