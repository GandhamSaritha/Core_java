package com.logicalstatements;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method startted!!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		if (n >= 0)
			System.out.println(" Given number is positive");
		else
			System.out.println("given number is negative");
		System.out.println("Main method ended!!");

	}

}
