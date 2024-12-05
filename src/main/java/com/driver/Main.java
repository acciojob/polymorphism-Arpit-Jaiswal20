package com.driver;

public class Main {

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function
        Product p = new Product();

        // Task 3: Call product(int x, int y)
        int result1 = p.product(5, 10);
        System.out.println("Product of 5 and 10: " + result1);

        // Task 4: Call product(int x, int y, int z)
        int result2 = p.product(5, 10, 2);
        System.out.println("Product of 5, 10, and 2: " + result2);

        // Task 5: Call product(double x, double y)
        double result3 = p.product(5.5, 2.5);
        System.out.println("Product of 5.5 and 2.5: " + result3);
    }

    // Task 1: Create a class Product inside Main
    static class Product {
        // Task 3: Method to calculate product of two integers
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method to calculate product of three integers
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method to calculate product of two doubles
        public double product(double x, double y) {
            return x * y;
        }
    }
}
