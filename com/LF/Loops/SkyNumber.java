package com.LF.Loops;

import java.util.Scanner;

public class SkyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int n = num;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int rem = n % 10;

            sum = sum + rem;
            product = product * rem;

            n = n / 10;
        }
        System.out.println("Sum of digits of given number:"+ sum);
        System.out.println("Product of digits of given number:"+ product);
        if (sum == product) {
            System.out.println("Sky Number");
        } else {
            System.out.println("Not a Sky Number");
        }
    }
}