package com.Programming_Challange;

import java.util.Scanner;

public class A007Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Swapping station\\n\\n");
		System.out.println("Enter the value of A: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("Swapping done...");
		System.out.println("Value of A is :" + a);
		System.out.println("Value of B is :" + b);
	}

}
