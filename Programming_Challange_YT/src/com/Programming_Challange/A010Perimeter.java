package com.Programming_Challange;

import java.util.Scanner;

//.Create a program to calculate Perimeter of a rectangle.
//Perimeter of rectangle ABCD = A+B+C

public class A010Perimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Perimeter Calculator...");
		System.out.println("Please enter the four side of Rectangle: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();

		double parameter = a + b + c + d;
		System.out.println("Perimeter of your Rectangle: " + parameter + " cm.");

	}

}
