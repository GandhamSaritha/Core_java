package com.langfundamentals;

public class VoidMethods {
	String stname ;
	int rollno;
	String course;
	int marks1;
	int marks2;
	int marks3;
	public static void main(String[] args) {
		VoidMethods a=new VoidMethods();
		a.displayStudentDetails();
		a.marks1=69;
		a.marks2=45;
		a.marks3=89;
		a.calculateTotal(a.marks1,a.marks2,a.marks3);
		a.calculateAverage(a.marks1,a.marks2,a.marks3);
	}
	void displayStudentDetails() {
		VoidMethods s= new VoidMethods();
		s.stname="Kinnu";
		s.rollno=420;
		s.course="JFS";
		System.out.println("Student Name :" + s.stname);
		System.out.println("Student Rollno :" + s.rollno);
		System.out.println("Student Course :" + s.course);
		VoidMethods t= new VoidMethods();
		t.stname="Bhanu";
		t.rollno=438;
		t.course="PFS";
		System.out.println("Student Name :" + t.stname);
		System.out.println("Student Rollno:" + t.rollno);
		System.out.println("Student Course :" + t.course);
		VoidMethods u= new VoidMethods();
		u.stname="saritha";
		u.rollno=459;
		u.course="JFS";
		System.out.println("Student Name :" + u.stname);
		System.out.println("Student Rollno :" + u.rollno);
		System.out.println("Student Course :" + u.course);
		
	}
	
	void calculateTotal(int m1,int m2,int m3){
		int total=m1+m2+m3;
		System.out.println("Total marks:"+ total);
	}
	
	void calculateAverage(int m1,int m2,int m3) {
		int avg=(m1+m2+m3/3);
		System.out.println("Average Marks:"+ avg);
	}
}
