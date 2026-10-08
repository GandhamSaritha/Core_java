package com.langfundamentals;

public class Literalstest {

	public static void main(String[] args) {
		Literalstest t1 = new Literalstest();
		System.out.println(t1);// Address of the Object -> @2b2fa4f7

//		Decimal numbers : Base is 10 --> 0 to 9 
		int a1 = 10;
		int a2 = 123;

//		Octal Literals : Any number starts with 0 will consider as Octal Literals.
//		Octal Base is (8) & Range is 0 to 7 
//		0 1 2 3 = 1*8^2 +2 *8^1 +3*8^0 = 64 + 16 + 3 = 83 
		int a3 = 0123;

		int a4 = 0654;
		int a5 = 0741;
//		int a6 = 0874;//The literal 0874 of type int is out of range 

//		Hexa-Decimal Literals : Any number starts with 0x will consider as Hexa-Decmal Literals.
//		Hexa-Decimal Literal base is 16 : Range 0 to 9 & a-f/A-F
//		a/A=10 b/B=11 c=12 d=13 e=14 f=15

//		0 + 1*16^2 +2*16^1 +3*16^0 = 256 + 32 + 3 = 291 
		int a7 = 0x123;
		int a8 = 0x2b2fa4f7;// Hexa-Decimal value of the Object will consider as Hashcode.
		int a9 = 0x1a2b;
		int a10 = 0XDAD;
		int a11 = 0xBee;
//		int a12 = 0xBeer;//Syntax error on token "r", delete this token
		
//		Binary Literals Base is 2 : Range is 0 to 1 
		int a13 = 0B1010;//   1*2^3 +0*2^2 +1*2^1  +0*2^0 = 8 + 0 + 2 + 0 = 10
		int a14 = 0b10101010;
		
		System.out.println("a1: "+a1);// 10
		System.out.println("a2: "+a2);// 123
		System.out.println("a3: "+a3);// 83

		System.out.println("a4: "+a4);// 428
		System.out.println("a5: "+a5);// 481
//		System.out.println("a6:"+a6);//572
		System.out.println("a7: "+a7);//291
		System.out.println("a8: "+a8);//724542711
		System.out.println("a9: "+a9);//6699
		System.out.println("a10: "+a10);
		System.out.println("a11: "+a11);
//		System.out.println("a12: "+a12);
		System.out.println("a13: "+a13);
		System.out.println("a14: "+a14);
		
		
		float f1 = 123;
		System.out.println("f1: "+f1);
		float f2 = 0123;
		System.out.println("f2: "+f2);
		float f3 = 0x123;
		System.out.println("f3: "+f3);
//		float f4 = 0123.5;
//		System.out.println("f4:  "+f4);
		float f5 = 0123.5F;
		System.out.println("f5: "+f5);
//		float f6 = 0x123.5F;
//		System.out.println("f6:"+f6);
		float f7 = 0345F;
		System.out.println("f7: "+f7);
		float f8 = 0x345F;
		System.out.println("f8: "+f8);
		float f9 = 567F;
		System.out.println("f9: "+f9);
		float f10 = 123.9F;
		System.out.println("f10: "+f10);
		float f11 = 0456F;
		System.out.println("f11: "+f11);
		
		
		
		double d1 = 123;
		System.out.println("d1: "+d1);
		double d2 = 0123;
		System.out.println("d2: "+d2);
		double d3 = 0x123;
		System.out.println("d3: "+d3);
		double d4 = 0123.5;
		System.out.println("d4:  "+d4);
		double d5 = 0123.5d;
		System.out.println("d5: "+d5);
//		double d6 = 0x123.5d;
//		SystCem.out.println("d6:"+d6);
		double d7 = 0345d;
		System.out.println("d7: "+d7);
		double d8 = 0x345d;
		System.out.println("d8: "+d8);
		double d9 = 567d;
		System.out.println("d9: "+d9);
		double d10 = 123.9d;
		System.out.println("d10: "+d10);
		double d11 = 0456d;
		System.out.println("d11: "+d11);
		
		
		char a='A';
		char b =65;
		System.out.println("a :"+ a);
		System.out.println("b :"+ b);
		
		String name1="saritha";
		String name2="saritha";
		System.out.println("String Literal primitive dt:" + (name1==name2));
		
		String s=new String("java");
		String t=new String("java");
		System.out.println("String Literals object dt:"+ (s==t));
		
		System.out.println("String Literal .equals :" + (name1.equals(name2)));
		
	}
	
	
	

}
