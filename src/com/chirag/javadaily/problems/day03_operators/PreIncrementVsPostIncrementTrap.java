package com.chirag.javadaily.problems.day03_operators;
/**
 * 1️⃣ Pre-Increment vs Post-Increment Trap
 *
 * Write a program to evaluate and print the result of:
 *
 * int x = 5;
 * int y = x++ + ++x;
 * System.out.println(x);
 * System.out.println(y);
 *
 * ActualOutput
 * value of x = 7
 * value of y = 12
 *
 * value of i = 4
 * value of m = 7
 *
 * Expected Output
 * y = 12
 * x = 7
 *
 * Observation
 *  x = 5
 *  y = x++ (post increment) x=5 + 7(++x(6)) (pre increment)
 *  y = 5 + 7
 *  y = 12
 *
 *  post-increment means updating value after current execution or operation
 *
 *  🔥 Interview-Ready Explanation (Memorize This)
 *
 * Java evaluates expressions from left to right.
 * Post-increment uses the current value and increments afterward.
 * Pre-increment increments first and then uses the updated value.
 * Applying these rules step-by-step gives i = 4 and m = 7.
 *
 */

public class PreIncrementVsPostIncrementTrap {

    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x;
        System.out.println("value of x = "+x);
        System.out.println("value of y = "+y);

        System.out.println("");
//        Second Problem

        int i = 1;
        int m = i++ + i++ + ++i;
        System.out.println("value of i = "+i); // 4
        System.out.println("value of m = "+m); // 7


    }


}
