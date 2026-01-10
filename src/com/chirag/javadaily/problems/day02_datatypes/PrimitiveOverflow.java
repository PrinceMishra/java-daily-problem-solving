package com.chirag.javadaily.problems.day02_datatypes;

/**
 *
 * 1️⃣ Primitive Overflow
 * Write separate Java programs to demonstrate overflow behavior for:
 * byte
 * short
 * int
 * Print values before and after overflow.
 *
 * Actual Output
 * before overflow b = 127
 * after overflow b = -128
 * before overflow s = 32767
 * after overflow s = -32768
 * before overflow i = 2147483647
 * after overflow i = -147483649
 *
 * Expected Output
 * before overflow b = 127
 * after overflow b = -128
 * before overflow s = 32767
 * after overflow s = -32768
 * before overflow i = 2147483647
 * after overflow i = -147483649
 *
 *
 * Observation
 * Primitive overflow is a runtime behavior caused by fixed-size
 * binary representation of primitive types.
 *
 * Compile-time errors occur due to implicit numeric promotion
 * (e.g., byte + int → int), not due to overflow.
 *
 * Overflow occurs only after successful compilation.
 */

public class PrimitiveOverflow {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println("before overflow b = " +b);
        b = (byte)(b+1);
        System.out.println("after overflow b = "+b);
        short s = 32767;
        System.out.println("before overflow s = " +s);
        s = (short)(s+1);
        System.out.println("after overflow s = " +s);
        int i = 2147483647;
        System.out.println("before overflow i = " +i);
        i=i+2000000000;
        System.out.println("after overflow i = "+i);
    }

}
