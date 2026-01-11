package com.chirag.javadaily.problems.day03_operators;

/**
 *
 * 6️⃣ Operator Precedence & Associativity
 *
 * Write a program that demonstrates how operator precedence affects the result of an expression.
 * Change the result using parentheses.
 *
 * Actual Output
 * Result without parentheses : 2172
 * Result with parentheses : 3456
 * Expected Output
 * Result without parentheses : 2172
 * Result with parentheses : 3456
 *
 * Observation
 * Operator precedence determines which operations are evaluated first.
 * Multiplication has higher precedence than addition, so it executes first.
 *
 * Parentheses override normal precedence rules and force explicit evaluation order,
 * which can significantly change the result of an expression.
 *
 * 🧠 One-Line Interview Answer (Memorize)
 *
 * Operator precedence controls evaluation order, while parentheses explicitly override that order.
 */

public class OperatorPrecedenceAndAssociativity {
    public static void main(String[] args) {

        int x = 12;
        int y = 20;
        int result = x+y*12*9;
        int resultPar = ((x+y)*12)*9;

        System.out.println("Result without parentheses : " + result);
        System.out.println("Result with parentheses : " + resultPar);

    }
}
