package com.Arrays;

import java.util.Arrays;

public class RoundArraysElements {

	public static void main(String[] args) {
		int[] arr= {99,98,55,72,66,84,12};
		for(int i=0;i<arr.length;i++) {
			int rem=arr[i] % 10;
			if(rem<=5) {
				arr[i]=arr[i]-rem;
			}else {
				arr[i]=arr[i]+(10-rem);
			}
		}
		System.out.println("result:"+Arrays.toString(arr));
	}

}
