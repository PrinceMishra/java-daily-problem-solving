package com.chirag.javadaily.problems.day02_datatypes;

/**
 *
 * 2️⃣ Implicit vs Explicit Type Casting
 * Write a program that shows:
 * implicit type conversion
 * explicit type casting
 * Include at least one case of data loss.
 *
 * Actual Output
 * Implicit type conversion:
 * byte to int: 100
 * int to float: 100.0
 *
 * Explicit type casting:
 * double to int: 443
 * short to byte: -1
 *
 * Data loss case:
 * 23.5 is float type converted to int leads to data loss: 23
 *
 * Expected Output
 * 23.50 is float type converted to int leads to data loss 23
 *
 * Observation
 * Implicit type conversion (widening) is performed automatically by the compiler
 * when converting a value to a compatible type with a larger range.
 *
 * Explicit type casting (narrowing) must be done manually and may lead to
 * precision loss or overflow.
 *
 */


public class ImplicitExplicitTypeCasting {

    public static void main(String[] args) {

        // -------- Implicit Type Conversion (Widening) --------
        byte b = 100;
        int i = b;          // byte → int
        float f = i;        // int → float

        System.out.println("Implicit type conversion:");
        System.out.println("byte to int: " + i);
        System.out.println("int to float: " + f);

        // -------- Explicit Type Casting (Narrowing) --------
        double d = 443.565;
        int i2 = (int) d;   // double → int (data loss)

        short s = 32767;
        byte b2 = (byte) s; // short → byte (overflow)

        System.out.println("\nExplicit type casting:");
        System.out.println("double to int: " + i2);
        System.out.println("short to byte: " + b2);

        // -------- Data Loss Example --------
        float f2 = 23.50f;
        int i3 = (int) f2;

        System.out.println("\nData loss case:");
        System.out.println(f2 + " is float type converted to int leads to data loss: " + i3);
    }
}

