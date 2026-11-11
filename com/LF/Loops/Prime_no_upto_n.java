package com.LF.Loops;

import java.util.Scanner;

public class Prime_no_upto_n {
	
	static boolean isprime(int num) {
		boolean  status=true;
		if(num==0 || num==1)
			return false;
		
		for(int i=2;i<num;i++) {
			if(num % i==0) {
				status=false;
				break;
			}
		}
		return status;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(isprime(i)) {
				count++;
				System.out.println(i+ "->" + count);
			}
			
		}
		
	}

}
