package com.langfundamentals;

public class Methodstest {

	int add() {
		int a = 10;
		int b = 40;
		int sum = a + b;
		return sum;
	}

	int sub() {
		int a = 90;
		int b = 40;
		int sub = a - b;
		return sub;
	}

	int Mul() {
		int a = 90;
		int b = 40;
		int Mul = a * b;
		return Mul;
	}

	int div() {
		int a = 90;
		int b = 40;
		int div = a / b;
		return div;
	}
	
	int mod() {
		int a = 90;
		int b = 40;
		int mod = a % b;
		return mod;
	}
	public static void main(String[] args) {
		Methodstest s = new Methodstest();
		int additionResult=s.add();
		System.out.println("addition result "+additionResult);
		int subtractionResult=s.sub();
		System.out.println("subtraction result "+subtractionResult);
		System.out.println(s.Mul());
		System.out.println(s.div());
		System.out.println(s.mod());
	}

}
