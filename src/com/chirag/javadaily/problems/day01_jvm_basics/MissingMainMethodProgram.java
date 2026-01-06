package com.chirag.javadaily.problems.day01_jvm_basics;

/**
 *
 * 5️⃣ Missing main() Method
 *
 * Write a Java class without a main() method.
 * Compile the class
 * Try to run it
 * Record the exact error message produced by the JVM
 *
 *  Expected Output
 *  not expected
 *Qq
 *  Actual Output
 *  Error: Could not find or load main class MissingMainMethodProgram
 *  Caused by: java.lang.NoClassDefFoundError: MissingMainMethodProgram (wrong name: com/chirag/javadaily/problems/day01_jvm_basics/MissingMainMethodProgram)
 *
 *  Observation
 *  • Java allows compilation without a main() method.
 * • JVM requires a valid public static void main(String[] args) to start execution.
 * • If main() is missing, JVM throws a runtime error before class initialization.
 * • Static blocks do NOT execute when main() is missing.
 */

public class MissingMainMethodProgram {
    static {
        System.out.println("static block executed");
    }
}
