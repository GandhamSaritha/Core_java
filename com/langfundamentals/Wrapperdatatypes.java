package com.langfundamentals;

public class Wrapperdatatypes {
	Integer stid=459;
	String stname="saritha";
	Integer age=22;
	Double marks=100d;
	Character grade='A';
	Boolean pass=true;
	double a=(double)100;
	int b= (int)1000D;
	char c= 65;
	char d='Z';
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wrapperdatatypes w=new Wrapperdatatypes();
		System.out.println("StudenetId : " + w.stid);
		System.out.println("StudenetName : " + w.stname);
		System.out.println("StudenetAge : " + w.age);
		System.out.println("StudenetMarks : " + w.marks);
		System.out.println("StudenetGrade : " + w.grade);
		System.out.println("Studenetpass : " + w.pass);
		System.out.println("Double: "+w.a);
		System.out.println("Int: "+w.b);
		System.out.println("char: "+w.c);
		System.out.println("char: "+w.d);
	}

}
