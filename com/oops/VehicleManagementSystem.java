package com.oops;

class Vehicle {
    protected String name;
    protected double speed;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void start() {
        System.out.println(name + " is starting.");
    }

    public void stop() {
        System.out.println(name + " has stopped.");
    }
}

public class VehicleManagementSystem {
	public static void main(String[] args) {
        Car car = new Car("Sedan X", 80.0);
        Bike bike = new Bike("Sportster 900", 65.0);
        Truck truck = new Truck("Hauler Pro", 50.0);

        System.out.println("--- Car ---");
        car.start();
        car.openSunroof();
        car.stop();
        
        System.out.println("----Bike-----");
        bike.start();
        bike.doWheelie();
        bike.stop();

        System.out.println("--- Truck-----");
        truck.start();
        truck.loadCargo();
        truck.stop();
    }
}
class Car extends Vehicle {
    public Car(String name, double speed) {
        super(name, speed);
    }

    public void openSunroof() {
        System.out.println(name + " opens the sunroof at " + speed + " km/h.");
    }
}

class Bike extends Vehicle {
    public Bike(String name, double speed) {
        super(name, speed);
    }

    public void doWheelie() {
        System.out.println(name + " performs a wheelie at " + speed + " km/h.");
    }
}
class Truck extends Vehicle {
    public Truck(String name, double speed) {
        super(name, speed);
    }

    public void loadCargo() {
        System.out.println(name + " loads cargo.");
    }
}
