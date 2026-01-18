package com.chirag.javadaily.problems.day05_methods_stack;

/**
 * 4️⃣ Recursion With Base Case
 *
 * Write a recursive method that:
 * calls itself
 * terminates using a base condition
 * Print each recursive call level.
 *
 * Actual Output
 *  Factorial of 5 is 120
 *
 * Expected Output
 * Factorial of 5 is 120
 *
 * Observation
 * Recursion works by repeatedly calling the same method with a smaller input
 * until a base condition is met. The base case stops further recursive calls
 * and begins returning values.
 *
 * Each recursive call creates a new stack frame. Once the base case is reached,
 * the stack unwinds in Last-In-First-Out (LIFO) order, combining results until
 * the final value is returned to the caller.
 *
 * 🧠 One-Line Interview Answer (MEMORIZE)
 * Recursion relies on a base case to stop infinite calls, and results are computed during stack unwinding in LIFO order.
 */

public class RecursionWithBaseCase {

    public int factorial(int x){
        if(x == 0)
            return 1;
        return x * factorial(x-1);
    }


    public static void main(String[] args) {

        int fact = 5;
        RecursionWithBaseCase obj = new RecursionWithBaseCase();
        System.out.println(" Factorial of " + fact + " is " + obj.factorial(fact));

    }

}
