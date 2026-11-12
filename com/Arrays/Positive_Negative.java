package com.Arrays;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of elements:");
		int size=sc.nextInt();
		int[] numbers=new int[size];
		System.out.println("Enter elements:");
		int p_count=0;
		int n_count=0;
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		for(int n:numbers) {
			if(n>=0) {
				p_count++;
			}else {
				n_count++;
			}
		}
		System.out.println("Count of Positive numbers:"+p_count);
		System.out.println("Count of Negative numbers:"+n_count);
	}

}
