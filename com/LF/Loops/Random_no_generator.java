package com.LF.Loops;

import java.util.Random;
import java.util.Scanner;

public class Random_no_generator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int guess = r.nextInt(100);
		String yn="";
		do {
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter your guess number:");
				int g_no = sc.nextInt();
				if (guess == g_no) {
					System.out.println("you guessed the correct number!!");
					break;
				} else if (g_no<guess){
					System.out.println("Too Low! Try Again");
				} else if (g_no>guess) {
					System.out.println("Too High! Try Again");
				} 
			}
			System.out.println("Game Over!! and the correct number is:"+guess);
			System.out.println("Do you wanna continue the game?(y for yes & n for no)");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		sc.close();
	}

}
