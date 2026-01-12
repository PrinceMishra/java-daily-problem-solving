package com.chirag.javadaily.problems.day04_loops;

/**
 * 4️⃣ Do-While Execution Guarantee
 *
 * Write a do-while loop where the condition is false initially.
 *
 * Verify how many times the loop body executes.
 *
 * Actual Output
 * It's do while!
 *
 * Expected Output
 * It's do while!
 *
 * Observation
 * In a do-while loop, the loop body executes once before the condition is evaluated.
 * Even if the condition is false initially, the body is guaranteed to run at least once.
 */

public class DoWhileExecutionGuarantee {

    public static void main(String[] args) {
        int x = 5;
        do {
            System.out.println("It's do while!");
        }while(x > 5);
    }
}
