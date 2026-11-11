package com.LF.Loops;
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int square = num * num;
        int sum = 0;
        System.out.println("Square of given number:"+square);
        while (square > 0) {
            int rem = square % 10;
            sum = sum + rem;
            square = square / 10;
        }
        System.out.println("sum of square of a number:"+ sum);
        if (sum == num) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}