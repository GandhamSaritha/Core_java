package com.logicalstatements.SwitchCase;

import java.util.Scanner;

public class Arithmetic_methods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String yn;
		do {
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter a number:");
		int b=sc.nextInt();
		int result=0;
		System.out.println("select one operator to perform : 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.modulus");
		int op=sc.nextInt();
		switch(op) {
		case 1->result= addition( a,b);
		case 2->result=subtraction(a,b);
		case 3-> result=Multiplication(a,b);
		case 4-> result=Division(a,b);
		case 5-> result=Modulus(a,b);
		default->System.out.println("Invalid operations");
		}
		System.out.println(result);
		System.out.println("Do you want to continue? select y for yes and n for no:");
		yn=sc.next();

		}while(yn.equalsIgnoreCase("y"));
		System.out.println("Calucation ended!!");
		sc.close();
		
	}

	 static int Modulus(int a, int b) {
		return a%b;
	}

	 static int Division(int a, int b) {
		return a/b;
	}

	 static int Multiplication(int a, int b) {
		return a*b;
	}

	 static int subtraction(int a, int b) {
		return a-b;
	}

	static  int addition(int a, int b) {
		return a+b;
	}
	
		

}
