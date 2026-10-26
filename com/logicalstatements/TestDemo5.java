package com.logicalstatements;

import java.util.Scanner;

public class TestDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int m= sc.nextInt();
		if (m<0 || m>100) 
			System.out.println("Invalid marks");
		else if(m>=90) 
			System.out.println("Grade A");
		else if(m>=75)
			System.out.println("Grade B");	
		else if(m>=60) 
			System.out.println("Grade C");
		else if(m>=35) 
			System.out.println("Grade D");
		else
			System.out.println("Fail");
		
		
			
	}

}
