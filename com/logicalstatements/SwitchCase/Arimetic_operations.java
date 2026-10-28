package com.logicalstatements.SwitchCase;

import java.util.Scanner;

public class Arimetic_operations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String yn;
		do {
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter a number:");
		int b=sc.nextInt();
		System.out.println("select one operator to perform : 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.modulus");
		int op=sc.nextInt();
		switch(op) {
		
		case 1->System.out.println("Addition of two numbers:"+ (a+b));
		case 2->System.out.println("Subtraction of two numbers:"+(a-b));
		case 3->System.out.println("Multiplication of two numbers:"+ (a*b));
		case 4-> System.out.println("Division of two numbers:"+ a/b);
		case 5-> System.out.println("Modulus of two numbers:"+ a%b);
		default->System.out.println("Invalid operations");
		}
		System.out.println("Do you want to continue? select y for yes and n for no:");
		yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("Calucation ended!!");
		sc.close();
	}

}
