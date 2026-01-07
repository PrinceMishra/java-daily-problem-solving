package com.chirag.javadaily.problems.day01_jvm_basics;

/**
 *6️⃣ Invalid main() Variations
 * Test the following main() method variations one by one in separate programs:
 * private static void main(String[] args)
 * protected static void main(String[] args)
 * static void main(String[] args) (default access)
 * public void main(String[] args) (non-static)
 * For each case:
 * Compile
 * Run
 * Record result
 *
 * Expected Output
 * invalid
 *
 * Actual Output
 * for "private static void main(String[] args)"
 *
 *
 * for "protected static void main(String[] args)"
 *
 *
 * for "public void main(String[] args) (non-static)"
 *
 *
 * observation
 * The JVM launcher requires an exact entry point:
 * public static void main(String[] args)
 *
 * If any of the following are invalid:
 * • access modifier (must be public)
 * • static keyword (must be static)
 * • method signature
 *
 * then the JVM fails at runtime with:
 * "Main method not found"
 */

public class InvalidMainMethodVariations{

//    protected static void main(String args[]){
//        System.out.println("Prince life is protected");
//    }
//    private static void main(String args[]){
//        System.out.println("Prince life is private");
//    }
    public void main(String args[]){
        System.out.println("Prince life is nothing");
    }

}
