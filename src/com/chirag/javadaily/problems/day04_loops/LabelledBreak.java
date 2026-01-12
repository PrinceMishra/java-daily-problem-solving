package com.chirag.javadaily.problems.day04_loops;

/**
 * 6️⃣ Labelled Break
 *
 * Write a program using labelled break to exit from nested loops.
 * Then remove the label and compare behavior.
 *
 * Actual Output
 * # # # #
 * # # # #
 * # # #
 * # #
 * #
 *
 * Expected Output
 * # # # #
 * # # # #
 * # # #
 * # #
 * #
 *
 * Observation
 * A normal break statement terminates only the nearest enclosing loop.
 * A labelled break terminates the loop that is associated with the label,
 * even if it is an outer loop.
 *
 * This allows exiting multiple levels of nested loops in a controlled way.
 */

public class LabelledBreak {
    public static void main(String[] args) {
//     🔹 Version 1: WITH labelled break
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i == j) {
                    break outer;
                }
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
//     🔹 Version 2: WITHOUT label (normal break)
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i == j) {
                    break; // breaks ONLY inner loop
                }
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
