package com.LF.Loops;

import java.util.Scanner;

public class Sum_of_digits_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum+=r;
		}
		System.out.println("Sum of digits of a number:"+ sum);
	}

}
