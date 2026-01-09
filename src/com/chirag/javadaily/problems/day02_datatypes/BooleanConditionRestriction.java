package com.chirag.javadaily.problems.day02_datatypes;

/**
 *4️⃣ Boolean Condition Restriction
 * Write a program that attempts to use:
 * a numeric value
 * a boolean value
 * inside an if condition.
 * Record the compilation result.
 *
 * Actual Output
 *Addition successful, value of a is 10
 *
 * Expected Output
 *Addition successful, value of a is 10
 *
 * Observation
 * In Java, the condition inside an if statement must be a boolean expression.
 * Numeric values (int, float, etc.) are not allowed and cause a compile-time error.
 * This is different from languages like C/C++, where non-zero values are treated as true.
 *
 */

public class BooleanConditionRestriction {
    public static void main(String[] args) {
        int a = 10;
        boolean b = true;
        if(b == true){
            a = a+5;
            System.out.println("Addition successful, value of a is "+ a);
        }
// ❌ Invalid: numeric value in if condition (compile-time error)
//        if(a){
//            System.out.println("Compilation error");
//        }
    }
}
