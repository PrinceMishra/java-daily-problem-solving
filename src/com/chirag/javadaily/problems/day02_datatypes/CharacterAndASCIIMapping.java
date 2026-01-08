package com.chirag.javadaily.problems.day02_datatypes;
/**
 * 3️⃣ Character and ASCII Mapping
 *
 * Write a program where:
 * an int value is assigned to a char
 * a char value is assigned to an int
 * Print the results.
 *
 * Actual Output
 * ASCII to Character a
 * Character to ASCII 99
 *
 * Expected Output
 * ASCII to Character a
 * Character to ASCII 99
 *
 * Observation
 * In Java, char is a 16-bit Unicode type, not ASCII.
 * When an int is assigned to a char, the value is treated as a Unicode code point.
 * When a char is assigned to an int, its Unicode numeric value is returned.
 * ASCII values match Unicode only for characters in the range 0–127.
 *
 * */

public class CharacterAndASCIIMapping {

    public static void main(String[] args) {
        char ch = 97;
        int i = 'c';
        System.out.println("ASCII to Character " + ch);
        System.out.println("Character to ASCII " + i);
    }
}
