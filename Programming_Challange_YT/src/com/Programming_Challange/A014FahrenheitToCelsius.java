package com.Programming_Challange;

import java.util.Scanner;

//.Create a program to convert Fahrenheit to Celsius
//°C = (°F - 32) × 5/9

public class A014FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Welcome to Temperature converter");
		System.out.println("Enter your temp in F: ");
		float fah = a.nextFloat();
		float cel = (fah - 32) * 5.0f / 9.0f;
		System.out.println("Your temparature is: " + cel + "C");
	}

}
