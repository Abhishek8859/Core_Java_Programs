package com.Programming_Challange;
//Create a program to calculate Compound interest.

//Compound Interest = P(1 + R/10

import java.util.Scanner;

public class A013CompoundInterest {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Welcome to Compound interest calculator\n");
		System.out.println("Please enter your principle amount Rs: ");
		int principle = ab.nextInt();
		System.out.println("Now, Tell me your rate of interest: ");
		float rate = ab.nextFloat();
		System.out.println("Now, tell me for how many years are you borrowing this money: ");
		float years = ab.nextFloat();
		double comInt = principle * Math.pow((1 + rate / 100), years);
		System.out.println("Your compound interest is Rs: " + comInt);
	}

}
