package com.logicalstatements;

import java.util.Scanner;

public class Swap_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter a number:");
		int b=sc.nextInt();
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("The value of number a:"+a);
//		System.out.println("The value of number b:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a:"+a);
		System.out.println("The value of number b:"+b);
		sc.close();

	}

}
