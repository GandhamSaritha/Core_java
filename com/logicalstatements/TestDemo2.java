package com.logicalstatements;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= sc.nextInt();
		if (n % 2 == 0)
			System.out.println("Given number is even");
		else 
			System.out.println("Given number is odd");
		System.out.println("Main method ended!!");

	}

}
