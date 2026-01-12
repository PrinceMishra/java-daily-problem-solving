package com.chirag.javadaily.problems.day04_loops;

/**
 * 3️⃣ Break vs Continue (Nested Loops)
 *
 * Write a program using nested loops to demonstrate the difference between:
 * break
 * continue
 *
 * Actual Output
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 *
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 *
 * Expected Output
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 *
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 *
 * Observation
 * In nested loops, break terminates the inner loop completely and control
 * moves to the next iteration of the outer loop.
 *
 * continue skips the remaining statements of the current iteration and
 * continues with the next iteration of the same loop.
 *
 * ✅ break
 * break immediately terminates the nearest enclosing loop or switch
 * and transfers control to the statement following it.
 *
 * ✅ continue
 * continue skips the remaining statements in the current iteration
 * and continues with the next iteration of the same loop.
 */

public class BreakVsContinueNestedLoops {


    public static void main(String[] args) {

        for (int i=1;i<=5;i++){

            for(int j=5;j>=1; j--){
                if(j==i)
                    break;
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i=1; i<=5; i++){

            for(int j = 5; j >= 1 ;j--) {
                if(j==i){
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
