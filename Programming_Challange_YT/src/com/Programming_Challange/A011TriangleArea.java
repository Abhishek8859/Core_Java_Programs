package com.Programming_Challange;

import java.util.Scanner;

//.Create a program to calculate the Area of a Triangle.
//Area of triangle = ½*B*H
public class A011TriangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wecome to Triangle Area Calculator...");
		System.out.println("Please enter the base in cms. :");
		double base = sc.nextDouble();
		System.out.println("Now, enter the value of hight in cms. :");
		double height = sc.nextDouble();
		double area = (base * height) / 2;

		System.out.println("The area of your triangle is : " + area + " cms");

	}
}
