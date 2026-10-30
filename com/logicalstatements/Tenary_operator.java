package com.logicalstatements;

import java.util.Scanner;

public class Tenary_operator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		String result=(a>0)? "positive number":"Negative number";
		System.out.println("Result :"+result);
	}

}
