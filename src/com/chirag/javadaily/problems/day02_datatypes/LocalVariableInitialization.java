package com.chirag.javadaily.problems.day02_datatypes;

/**
 * 6️⃣ Local Variable Initialization
 * Write a program where:
 * a local variable is declared but not initialized
 * an attempt is made to use it
 *
 * Observe and record the compiler error.
 *
 * Actual Output
 *
 * Expected Output
 * compile time error
 * x is not initialized
 *
 * Observation
 * Local variables in Java do not receive default values.
 * They must be definitely assigned a value before use.
 * If the compiler cannot guarantee initialization on all execution paths,
 * it throws a compile-time error.
 * */

public class LocalVariableInitialization {

    public static void main(String[] args) {
        int x;
//        System.out.println("value of x is "+ x);

/**
 * Java uses a rule called:
 *      Definite Assignment Analysis
 *
 * Meaning:
 *      Before a local variable is read, the compiler must be able to prove that it has been assigned a value on all possible execution paths.
 */
    }

}
