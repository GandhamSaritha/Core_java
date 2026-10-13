package com.langfundamentals;

public class Caluculation {
	void main() {
		System.out.println("main method started.");
		int s = addition();
		System.out.println("Addition of two numbers: "+ s);

		int su = subtraction();
		System.out.println("Subtraction of two numbers: " + su);

		double m = multiplication();
		System.out.println("Multiplication of two numbers : " + m);

		double d = division();
		System.out.println("Division of two numbers : " + d);
		
		double e = division();
		System.out.println("Modulus of two numbers : " + e);
		
		System.out.println("main method ended.");
	}

	double multiplication() {
		System.out.println("Multiplication method called ");
		int a = 300;
		int b = 5;
		int product = a * b;
		return product;
	}

	int addition() {
		System.out.println("addition method called ");

		int a = 100;
		int b = 200;
		int sum = a + b;
		return sum;

	}

	int subtraction() {
		System.out.println("subtraction method called ");

		int a = 700;
		int b = 200;
		int sub = a - b;
		return sub;

	}

	double division() {
		System.out.println("Division method called ");
		int a = 500;
		int b = 5;
		int div = a / b;
		return div;
	}
	
	double modulus() {
		System.out.println("Modulus method called ");
		int a=5212;
		int b=10;
		int mod = a % b;
		return mod;
	}

}
