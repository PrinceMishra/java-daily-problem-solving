package com.chirag.javadaily.problems.day01_jvm_basics;

/**
 *
 * 7️⃣ Class Loading Without Object Creation
 * Write a program where:
 * a class has a static block
 * no object is created
 * class loading still occurs
 * Prove this using output.
 *
 * Actual Output
 *  (verify by running)
 *
 * Expected Output
 * It's a static block.
 * Main block started.
 *
 * Observation
 * Class initialization (static block execution) does not require object creation.
 * The JVM loads and initializes a class before invoking its main() method,
 * therefore static blocks execute even when no object is created.
 */

public class ClassLoadWithoutObjectCreation {
// class loads even if there is no object created
    static{
        System.out.println("It's a static block.");
    }

    public static void main(String[] args) {
        System.out.println("Main block started.");
    }


}
