package com.chirag.javadaily.problems.day04_loops;

/**
 * 7️⃣ Loop Modification Inside Body
 *
 * Write a loop where:
 *
 * the loop variable is modified inside the loop body
 *
 * observe how it affects iteration count
 *
 * Actual Output
 *1
 * 3
 * 5
 * 7
 * 9
 *
 * Expected Output
 * 1
 * 3
 * 5
 * 7
 * 9
 *
 * Observation
 * When the loop variable is modified inside the loop body in addition to
 * the loop’s increment expression, it directly affects the number of iterations.
 * In this case, the variable is incremented twice per iteration, causing the loop
 * to skip values.
 */

public class LoopModificationInsideBody {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            i = i +1;
            System.out.println(i+" ");
        }
    }
}
