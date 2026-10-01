package com.langfundamentals;

public class AutoboxingAndUnboxing {
	Integer stid=459;
	Integer marks=100;
	Boolean pass=true;
	double a=59.45;
	public static void main(String[] arg) {
		AutoboxingAndUnboxing s=new AutoboxingAndUnboxing();
		int i=s.stid;  //Autounboxing
		Double b=s.a; //Autoboxing
		System.out.println(s.stid);
		System.out.println(s.marks);
		System.out.println(s.pass);
		System.out.println(s.a);
		System.out.println(i);
		System.out.println(b);
	}
}
