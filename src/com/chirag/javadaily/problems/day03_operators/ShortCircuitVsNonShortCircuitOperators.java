package com.chirag.javadaily.problems.day03_operators;

/**
 *2️⃣ Short-Circuit vs Non-Short-Circuit Operators
 *
 * Write a program demonstrating the difference between:
 * &&
 * &
 *
 * Ensure the second condition has a visible side effect.
 *
 * Actual Output
 * After && : y = 6
 * After &  : y = 7
 *
 * Expected Output
 * x = 5 and y =6
 * z is after & operation between operands x , y is 4
 *
 * * Observation
 * The logical AND operator (&&) is short-circuiting.
 * If the first condition is false, the second condition is not evaluated.
 *
 * The logical AND operator (&) when used with boolean expressions is non-short-circuiting.
 * It evaluates both conditions regardless of the first result.
 */

public class ShortCircuitVsNonShortCircuitOperators {

    public static void main(String[] args) {

        int x = 5;
        int y = 6;

        // Short-circuit AND (&&)
        if (x > 10 && ++y > 6) {
            System.out.println("Inside && block");
        }
        System.out.println("After && : y = " + y);

        // Reset y
        y = 6;

        // Non-short-circuit AND (&) with boolean expressions
        if (x > 10 & ++y > 6) {
            System.out.println("Inside & block");
        }
        System.out.println("After &  : y = " + y);
    }

}
