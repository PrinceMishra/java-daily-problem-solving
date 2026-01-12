package com.chirag.javadaily.problems.day04_loops;

/**
 * 8️⃣ Multiple Control Variables
 *
 * Write a for loop that uses multiple variables in initialization and update sections.
 *
 * Print values during each iteration.
 *
 *  Actual Output
 * i = 0
 * x = 5
 * i = 1
 * x = 4
 * i = 2
 * x = 3
 *
 * Expected Output
 * i = 0
 * x = 5
 * i = 1
 * x = 4
 * i = 2
 * x = 3
 *
 * Observation
 * A for loop in Java can have multiple control variables in the initialization
 * and update sections, separated by commas. These variables must be of the same
 * type and are updated together on each iteration.
 *
 * ❓ Can a for-loop have multiple conditions?
 * ❌ No.
 * for (int i = 0; i < 5, x > 0; i++) // ❌
 *
 * ✔ Only one condition expression is allowed
 * ✔ That expression may contain logical operators
 */

public class MultipleControlVariables {
    public static void main(String[] args) {
        for (int i = 0, x = 5; i < x; i++, x--) {
            System.out.println("i = " + i);
            System.out.println("x = " + x);
        }
    }

}
