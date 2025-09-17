package com.assignment.utilities;
import employees.Employee;

public class EmployeeUtilities {

    // Public method - accessible everywhere
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    // Protected method - accessible within package & subclasses
    public static void increaseSalary(Employee emp, double amount) {
        emp.setSalary(emp.getSalary() + amount);
    }

    // Private method - only accessible inside this class
    private static void confidentialMessage() {
        System.out.println("This is a confidential utility message!");
    }
}

