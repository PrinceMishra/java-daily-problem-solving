package com.chirag.javadaily.problems.day04_loops;

/**
 *5️⃣ Loop Variable Scope
 *
 * Write a program that:
 * declares a loop variable inside the loop
 * attempts to access it outside the loop
 *
 * Observe and record the compiler error.
 *
 * Actual Output
 * java: cannot find symbol
 *
 * Expected Output
 * java: cannot find symbol
 *
 * Observation
 * In Java, variables declared inside a loop or any block are limited to that block’s scope.
 * They cannot be accessed outside the block, and attempting to do so results in a
 * compile-time error because the variable is out of scope.
 */

public class LoopVariableScope {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            int x = i;
            System.out.println(x);
        }
//        System.out.println(x);
    }
}
