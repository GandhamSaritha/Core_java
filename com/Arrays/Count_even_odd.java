package com.Arrays;

import java.util.Scanner;

public class Count_even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of elements:");
		int size= sc.nextInt();
		int count_even=0;
		int count_odd=0;
		int[] numbers = new int[size]; 	
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		for(int n:numbers) {
			if(n %2==0) {
				count_even++;
			}else{
				count_odd++;
			}
		}
		System.out.println("Count even elements:"+count_even);
		System.out.println("Count odd elements:"+count_odd);
	}

}
