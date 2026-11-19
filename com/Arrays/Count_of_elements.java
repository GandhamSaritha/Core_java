package com.Arrays;

public class Count_of_elements {
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,1,2,3,4,5,6,1,4,2};
	        
	        // Boolean array to keep track of elements we have already counted
	        boolean[] visited = new boolean[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            // Skip this element if it was already counted
	            if (visited[i]) {
	                continue;
	            }

	            int count = 1;
	            // Compare arr[i] with the rest of the elements
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    visited[j] = true; // Mark duplicate as visited
	                    count++;
	                }
	            }

	            System.out.println(arr[i] + "->" + count);
	        }
			
	}

}
