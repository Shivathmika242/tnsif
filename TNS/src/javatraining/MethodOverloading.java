package javatraining;

public class MethodOverloading {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values (different data type)
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Calls add(int, int)
        System.out.println("Sum of two integers: " + obj.add(10, 20));

        // Calls add(int, int, int)
        System.out.println("Sum of three integers: " + obj.add(5, 15, 25));

        // Calls add(double, double)
        System.out.println("Sum of two doubles: " + obj.add(12.5, 7.5));
    }
}




