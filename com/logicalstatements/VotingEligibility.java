package com.logicalstatements;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		boolean  indianCitizen, hasVoterId;
		System.out.println("Enter your age:");
		age = sc.nextInt();
		System.out.println("Enter your indianCitizen:(if yes give true else false)");
		indianCitizen=sc.nextBoolean();
		System.out.println("hasvoterId:(true/false)");
		hasVoterId=sc.nextBoolean();
		int status=0;
		if (age<=0) {
			status=1;
		}else if (age<18) {
			status=2;
		}else if (!indianCitizen) {
			status=3;
		}else if(!hasVoterId) {
			status=4;
		}else {
			status=5;
		}
		switch(status) {
		case 1  -> System.out.println("Invalid age");
		case 2 -> System.out.println("Not eligible to vote");
		case 3 -> System.out.println("Indian Citizenship  required -> Not eligible for vote");
		case 4 -> System.out.println("Voter ID required -> Not eligible");
		case 5 -> System.out.println("Eligible to vote");
		default -> System.out.println("Invalid status!!");
		}
	}

}
