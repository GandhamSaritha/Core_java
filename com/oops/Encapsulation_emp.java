package com.oops;

public class Encapsulation_emp {
	//  Private fields (Data Hiding)
    private int id;
    private String name;
    private double salary;
    private String password;

    //  Public Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) { // Optional validation
            this.salary = salary;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Main method to access and modify the data
	public static void main(String[] args) {
		Encapsulation_emp emp = new Encapsulation_emp();

        // Modifying data using setters
        emp.setId(101);
        emp.setName("Rahul");
        emp.setSalary(55000.0);
        emp.setPassword("Pass@123");

        // Accessing data using getters
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Password: " + emp.getPassword());
	}

}
