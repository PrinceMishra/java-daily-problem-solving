package com.chirag.javadaily.problems.day02_datatypes;

/**
 * 8️⃣ Widening vs Narrowing Conversion
 * Write a program demonstrating:
 * widening conversion
 * narrowing conversion
 *
 * Print results and observe differences.
 *
 * Actual Output
 * Widening Conversion. No data loss, int to long 2147483647 to 2147483647
 * Narrowing Conversion. Data loss, int to short 2147483647 to -1
 *
 * Expected Output
 * Widening Conversion. No data loss, int to long 2147483647 to 2147483647
 * Narrowing Conversion. Data loss, int to short 2147483647 to -1
 *
 * Observation
 * Widening conversion increases the storage size of the data type,
 * so the original value is preserved and no data loss occurs.
 *
 * Narrowing conversion reduces the storage size of the data type.
 * During this process, higher-order bits are discarded, which can
 * lead to data loss or value change.
 *
 *
 */

public class WideningVsNarrowingConversion {

    public static void main(String[] args) {
        // widening conversion
        int i = 2147483647;
        long l = i;
        System.out.println("Widening Conversion. No data loss, int to long " + i + " to " + l);
        //Narrowing Conversion
        short s = (short)i;
        System.out.println("Narrowing Conversion. Data loss, int to short " + i + " to " + s);
    }
}
