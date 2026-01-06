package com.chirag.javadaily.problems.day01_jvm_basics;

/**
 * 3️⃣ Multiple Static Blocks
 *
 * Write a single class that has three static blocks placed at different positions in the source file.
 * Run the program and record the execution order.
 *
 * Expected Output
 * Initialization Block A
 * Initialization Block B
 * Initialization Block C
 * It's main Block!
 *
 * Actual Output
 * (verify by running)
 *
 * Observation
 * All static blocks execute during class initialization,
 * in the top-to-bottom order of their appearance in the source file,
 * before main() is invoked, regardless of where main() is written.
 *
 */
public class MultipleStaticBlocksProgram {

     static {
        System.out.println("Initialization Block A");
    }
    static{
        System.out.println("Initialization Block B");
    }

    public static void main(String[] args) {
        System.out.println("Main Started!!");
    }

    static {
        System.out.println("Initialization Block C");
    }

}
