package com.langfundamentals;

import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
		// . Create a Scanner object
		Scanner scanner = new Scanner(System.in);

		// Prompt and read a String (Full Line)
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		// Prompt and read an Integer
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		// Prompt and read a Double
		System.out.print("Enter your GPA: ");
		double gpa = scanner.nextDouble();

		// Displaying the captured inputs
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("GPA: " + gpa);

		// 6. Close the scanner to release resources
		scanner.close();
	}

}
  