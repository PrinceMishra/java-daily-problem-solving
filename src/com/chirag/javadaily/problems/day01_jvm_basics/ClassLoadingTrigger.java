package com.chirag.javadaily.problems.day01_jvm_basics;

/**
 * 2️⃣ Class Loading Trigger
 * Create two classes:
 * ClassA → contains only a static block
 * ClassB → contains main()
 * In main(), reference ClassA in such a way that you can prove exactly when ClassA is loaded.
 *
 * Actual Output:
 * Class A initialized
 * x = 6
 *
 *  Expected Output:
 *  Class A Initialized
 *  x =6;
 *
 *  Observations:
 *  - Static block executes when class is loaded
 *  - main() is the entry point
 *  - before main() runs static block executed and memory allocated to x initialization block executed first
 */

class ClassLoadingSecond{
    static int x = 6;
    // static initialization block
    static {
        System.out.println("Class A initialized");
    }
}

public class ClassLoadingTrigger {
    public static void main(String[] args) {
        System.out.println("x = " + ClassLoadingSecond.x);

    }
}

