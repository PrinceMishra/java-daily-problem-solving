package com.chirag.javadaily.problems.day03_operators;

/**
 * 9️⃣ Assignment Inside Condition
 *
 * Write a program that uses assignment (=) inside an if condition.
 *
 * Observe compiler behavior and output
 *
 * Actual Output
 * Inside if
 * b = true
 *
 * Expected Output
 *Inside if
 * b = true
 *
 * Observation
 * Java allows assignment inside an if condition because assignment is an
 * expression that returns a value.
 *
 * However, Java does not allow variable declarations inside conditions.
 * The compile-time error occurs due to invalid syntax, not because
 * assignment is forbidden.
 */
public class AssignmentInsideCondition {
    public static void main(String[] args) {

        boolean b = false;

        if (b = true) {   // assignment, NOT comparison
            System.out.println("Inside if");
        }

        System.out.println("b = " + b);
    }
}
