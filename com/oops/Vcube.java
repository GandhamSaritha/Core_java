package com.oops;

class Device {
    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class Laptop extends Device {
    private String ram;
    private String processor;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("RAM: " + ram);
        System.out.println("Processor: " + processor);
    }

    public void runIDE() {
        System.out.println("IDE running......");
    }

    public void compileCode() {
        System.out.println("Code compiled.....");
    }
}

class Mobile extends Device {
    private String camera;  
    private String battery; 
    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void makeCall() {
        System.out.println("Making a call...");
    }

    public void takePhoto() {
        System.out.println("Photo clicked!");
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Camera: " + camera);
        System.out.println("Battery: " + battery);
    }
}

public class Vcube {
    public static void main(String[] args) {
       
        Laptop lap = new Laptop();
        Mobile mob = new Mobile();

        
        lap.setBrand("HP");
        lap.setPrice(65000);
        lap.setProcessor("Intel i7");
        lap.setRam("16 GB");

        mob.setBrand("Samsung");
        mob.setPrice(35000);
        mob.setCamera("50 MP");
        mob.setBattery("5000 mAh");

       
        Device d1 = lap;
        Device d2 = mob;

        System.out.println("--- Laptop Details ---");
        d1.displayDetails(); 
        System.out.println("\n--- Mobile Details ---");
        d2.displayDetails();

       
        lap.runIDE();
        lap.compileCode();

        mob.makeCall();
        mob.takePhoto();
    }
}
