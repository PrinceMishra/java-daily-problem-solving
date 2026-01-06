package com.chirag.javadaily.problems.day01_jvm_basics;

/**
 *
 * 4️⃣ Memory Area Identification
 * Write a program that declares:
 * one static variable
 * one instance variable
 * one local variable
 * Print all values and add comments identifying which JVM memory area each variable belongs to.
 *
 * Expected Output
 * Static Variable stat = 26
 * Instance Variable instance = 07
 * Local Variable local = 1999
 *
 * Actual Output
 * (verify by running)
 *
 * Observation
 * Static variables belong to the class → stored in Method Area (Metaspace), BELONGS TO A CLASS METADATA
 * Instance variables belong to objects → stored in Heap
 * Local variables belong to method execution → stored in Stack Frame
 * Scope alone does not decide memory location; variable lifetime and ownership do.
 */

public class MemoryAreaIdentificationProgram {

    static int stat = 26; // static variable , It belongs to Method Memory Area(Metaspace) in JVM

    int instance = 07; // instance variable , It belongs to Heap Memory Area in JVM

    public static void main(String[] args) {
        int local = 1999; // Local variable . It belongs to Stack Memory Area in JVM
        System.out.println("Static Variable stat = "+ stat);
        MemoryAreaIdentificationProgram obj = new MemoryAreaIdentificationProgram();
        System.out.println("Instance Variable instance = "+ obj.instance);
        System.out.println("Local Variable local = "+ local);
    }


}
