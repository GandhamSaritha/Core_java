package com.Arrays;

import java.util.Scanner;

public class Zeros_to_end {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter numbers:");
		
        // Loop 1: Print all numbers that are NOT zero
		 
        for (int i = 0; i < size; i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.print("Output: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
       

        // Loop 2: Print all the zeros at the end
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i] + " ");
            }
        }
      
	}

}
