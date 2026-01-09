package com.chirag.javadaily.problems.day02_datatypes;

/**
 * 7️⃣ Floating-Point Literal Error
 * Write code that fails due to:
 * float f = 10.5;
 *
 * Fix the code using two different valid approaches.
 *
 * Actual Output
 *(Verify by running)
 * Expected Output
 * by default f stores double value that's why it needs (float) and 'f' postfix 10.5 and 20.5
 *
 * Observation
 *  In Java, floating-point literals are of type double by default.
 * Assigning a double literal to a float variable causes a compile-time error
 * due to possible precision loss.
 *
 * The issue can be fixed either by:
 * 1) using the 'f' suffix to make the literal a float
 * 2) explicitly casting the double literal to float
 */

public class FloatingPointLiteralError {
    public static void main(String[] args) {
        //float f = 10.5;  compile time error
        // after fixing the code
        float f = 10.5f;     // first way
        float f1 = (float)20.5;     //second way

        System.out.println("by default literal 10.5 is double  that's why it needs float and f suffix "+f+ " and "+f1);
    }
}
