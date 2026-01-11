package com.chirag.javadaily.problems.day03_operators;
/**
 * 7️⃣ Switch Statement Fall-Through
 *
 * Write a switch statement without break statements.
 * Observe and record the output.
 *
 * Actual Output
 * This is the average case.
 * This is the worst case
 *
 * Expected Output
 *This is the average case.
 * This is the worst case
 *
 * Observation
 * In a switch statement, once a matching case is found, execution continues
 * sequentially through subsequent cases until a break statement is encountered
 * or the switch block ends. This behavior is called fall-through.
 *
 * 🔥 One-Line Interview Answer (Memorize)
 * Switch fall-through occurs when break is omitted, causing execution to continue into subsequent cases after a match.
 */
public class SwitchStatementFallThrough {


    public static void main(String[] args) {

        char ch = 'b';
        switch(ch){
            case 'a' :
                System.out.println("This is the best case.");
            case 'b' :
                System.out.println("This is the average case.");
            case 'c' :
                System.out.println("This is the worst case");
        }
    }


}
