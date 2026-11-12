package com.Arrays;

public class Second_largest {

	public static void main(String[] args) {
		        int[] arr = {2, 7, 13, 9, 8, 13,18};

		        // Step 1: Find the largest number
		        int largest = arr[0];
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > largest) {
		                largest = arr[i];
		            }
		        }

		        // Step 2: Find the largest number that is smaller than 'largest'
		        int secondLargest = -1; // Assuming positive numbers in the array
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] != largest && arr[i] > secondLargest) {
		                secondLargest = arr[i];
		            }
		        }

		        System.out.println("Distinct second element is: " + secondLargest);
		    }
		

	

}
