package com.chirag.javadaily.problems.day01_jvm_basics;

/**
 * Problem:
 * Demonstrate execution order of:
 * 1. Static block
 * 2. Instance initializer block
 * 3. Constructor
 * 4. main() method
 *
 * Expected Output:
 * Static block executed
 * Main method started
 * Instance block executed
 * Constructor executed
 *
 * Actual Output:
 * Static block executed
 * Main method started
 * Instance block executed
 * Constructor executed
 *
 * Observations:
 * - Static block executes when class is loaded
 * - main() is the entry point
 * - Instance block and constructor execute during object creation
 */

public class ExecutionOrder {

    // Static variable (stored in Metaspace / Method Area)
    static int staticVar = 10;

    // Instance variable (stored in Heap)
    int instanceVar = 20;

    // Static block (runs once when class is loaded)
    static {
        System.out.println("Static block executed");
    }

    // Instance initializer block (runs before constructor)
    {
        System.out.println("Instance block executed");
    }

    // Constructor
    public ExecutionOrder() {
        System.out.println("Constructor executed");
    }

    // main method (JVM entry point)
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Object creation triggers instance block + constructor
        ExecutionOrder obj = new ExecutionOrder();
    }
}

