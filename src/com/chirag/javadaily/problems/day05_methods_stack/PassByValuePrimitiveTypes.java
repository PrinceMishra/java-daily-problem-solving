package com.chirag.javadaily.problems.day05_methods_stack;

/**
 * 2️⃣ Pass-by-Value (Primitive Types)
 *
 * Write a program that:
 * passes two primitive variables to a method
 * attempts to swap their values
 *
 * Print values:
 * before method call
 * inside method
 * after method call
 *
 * Actual Output
 *
 * Expected Output
 *
 * Observation
 * When primitive variables are passed to a method, Java passes a copy of their values.
 * Any modification inside the method affects only the local copies and does not
 * change the original variables in the caller.
 *
 * 🧠 One-Line Interview Answer (MEMORIZE)
 * In Java, primitive types are passed by value, so changes inside a method do not affect the caller’s variables.
 */

public class PassByValuePrimitiveTypes {

    public void swap (int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before value of a = " + a);
        System.out.println("Value of b = " + b) ;

        PassByValuePrimitiveTypes obj = new PassByValuePrimitiveTypes();
        obj.swap(a,b);
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

    }

}
