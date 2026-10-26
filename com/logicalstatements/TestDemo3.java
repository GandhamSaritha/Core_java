package com.logicalstatements;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int a = sc.nextInt();
		if (a>=18)
			System.out.println("Eligible for vote");
		else
			System.out.println("Not eligible for vote");

	}

}
