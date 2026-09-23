package com.langfundamentals;

public class Purchase_snacks {
	
	public static int shop(int chocolate, int cookie, int total) {
		chocolate= chocolate * 15;
		cookie = cookie * 10;
		int sum = chocolate + cookie ;
		return total-sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chocolate = 10 ;
		int cookie = 5;
		int total = 450;
		System.out.println(shop(chocolate,cookie,total));

	}

}
