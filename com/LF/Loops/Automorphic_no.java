
package com.LF.Loops;

import java.util.Scanner;

public class Automorphic_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n = sc.nextInt();

        int sq = n * n;
        int n1 = n;
        System.out.println(sq);

        int count = 1;

        while (n1 > 0) {
            n1 = n1 / 10;
            count = count * 10;
        }

        if (sq % count == n) {
            int result = sq % count;
            System.out.println("Automorphic No.:" + result);
        } else {
            System.out.println("Not an Automorphic No.");
        }

        sc.close();
    }
}
