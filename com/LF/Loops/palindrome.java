package com.LF.Loops;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rev=reverse_no(n);
		if(rev == n) {
			System.out.println("Given number is a palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
	}

	private static int reverse_no(int n) {
		int r=0;
		int reverse=0;
		while(n>0) {
			 r=n%10;
			 n=n/10;
			 reverse = reverse*10 + r;
		}
		return reverse;
	}

}
