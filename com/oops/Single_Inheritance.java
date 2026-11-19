package com.oops;

class Vehicle1{
	int speed=50;
	public void display() {
		System.out.println("speed of vehicle is:"+speed);
	}
	
}
public class Single_Inheritance {

	public static void main(String[] args) {
		Vehicle1 c=new Car1();
		c.display();
		System.out.println(c.speed);
	}

}
class Car1 extends Vehicle1{
	
	int speed=100;
	@Override
	public void display() {
		System.out.println("speed of vehicle is:"+speed);
	}	
}