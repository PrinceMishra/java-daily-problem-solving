package com.chirag.javadaily.problems.day04_loops;

/**
 * 1️⃣ For Loop Without Body
 *
 * Write a program to evaluate and print the output of:
 * for(int i = 0; i < 5; System.out.println(i++));
 *
 * Actual Output
 *
 * Expected Output
 * not sure
 *
 * Observation
 * In this for-loop, the semicolon makes the loop body empty.
 * The printing happens in the increment section of the loop.
 * On each iteration, the condition is checked first, then the increment
 * expression is executed, which prints the value and increments i.
 */

public class ForLoopWithoutBody {
    public static void main(String[] args) {
        for(int i = 0; i < 5; System.out.println(i++));
    }
}
