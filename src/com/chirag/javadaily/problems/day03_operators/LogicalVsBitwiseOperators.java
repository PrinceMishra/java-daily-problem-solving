package com.chirag.javadaily.problems.day03_operators;

/**
 * 3️⃣ Logical vs Bitwise Operators
 * Write a program comparing:
 *
 * | vs ||
 * & vs &&
 *
 * Print results and observe evaluation behavior.
 *
 * Actual Output
 * x = 5
 * y = 6
 * x | y = 7
 * After ||, a = 6
 * After |,  a = 6
 * x & y = 4
 * After &&, b = 5
 * After &,  b = 6
 *
 * Expected Output
 * x = 5
 * y = 6
 * x | y = 7
 * After ||, a = 6
 * After |,  a = 6
 * x & y = 4
 * After &&, b = 5
 * After &,  b = 6
 *
 * Observation
 * Bitwise operators (| and &) operate on individual bits when used with integers.
 *
 * When used with boolean expressions:
 * - || and && are short-circuit operators and may skip evaluation of the second operand.
 * - | and & are non-short-circuit operators and always evaluate both operands.
 *
 * This difference is visible when the second operand has side effects.
 *
 * 🧠 One-Line Interview Answer
 *
 * || and && short-circuit evaluation, while | and & always evaluate both operands when used with booleans.
 */

public class LogicalVsBitwiseOperators {
    public static void main(String[] args) {

        int x = 5;
        int y = 6;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // -------- Bitwise OR --------
        int z = x | y;
        System.out.println("x | y = " + z);

        // -------- Logical OR vs Non-Short-Circuit OR --------
        int a = 5;

        if (x > 10 || ++a > 5) {
            // short-circuit OR
        }
        System.out.println("After ||, a = " + a);

        a = 5; // reset

        if (x > 10 | ++a > 5) {
            // non-short-circuit OR
        }
        System.out.println("After |,  a = " + a);

        // -------- Bitwise AND --------
        int m = x & y;
        System.out.println("x & y = " + m);

        // -------- Logical AND vs Non-Short-Circuit AND --------
        int b = 5;

        if (x > 10 && ++b > 5) {
            // short-circuit AND
        }
        System.out.println("After &&, b = " + b);

        b = 5; // reset

        if (x > 10 & ++b > 5) {
            // non-short-circuit AND
        }
        System.out.println("After &,  b = " + b);
    }
}
