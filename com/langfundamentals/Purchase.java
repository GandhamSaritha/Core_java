package com.langfundamentals;

public class Purchase {
	static int chocolate = 15;
	static int cookie=10 ;
	static int total=450;
	static int buy_chocolates= 10 * chocolate;
	static int buy_cookies= 5 *cookie ;
	static int sum = buy_chocolates + buy_cookies;
	static int cost= total - sum ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(cost);
	}

}
