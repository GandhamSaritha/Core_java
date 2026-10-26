package com.logicalstatements;

import java.util.Scanner;

public class TestDemo4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int a = sc.nextInt();
		System.out.println("Enter a Number :");
		int b = sc.nextInt();
		if (a==b)
			System.out.println("two numbers are equal");
		else
			System.out.println("not equal");
		
	}

}
