package com.driver;

public class Main {
    static  class Product{

        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method with the following definition
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create an overloaded method with the following definition
        public double product(double x, double y) {
            return x * y;
        }
    }
    public static  void main(String[] args)
    {
        Product p = new Product();

        // Call the first method
        System.out.println("Product of two integers: " + p.product(5, 10));

        // Call the overloaded method with three integers
        System.out.println("Product of three integers: " + p.product(5, 10, 2));

        // Call the overloaded method with two doubles
        System.out.println("Product of two doubles: " + p.product(5.5, 2.5));

    }
}