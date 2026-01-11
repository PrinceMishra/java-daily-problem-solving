package com.chirag.javadaily.problems.day03_operators;

/**
 *5️⃣ Nested Ternary Operator
 *
 * Write a program using nested ternary operators to evaluate a condition.
 * Rewrite the same logic using if-else.
 *
 * Actual Output
 * By Ternary Operator
 * You are allowed teen.
 *
 * By if-else Operator
 * You are allowed teen.
 *
 * Expected Output
 *By Ternary Operator
 * You are allowed teen.
 *
 * By if-else Operator
 * You are allowed teen.
 *
 * Observation
 *
 *
 */

public class NestedTernaryOperator {

    public static void main(String[] args) {

        int age = 16;
        int requiredAge = 17;
        System.out.println("By Ternary Operator");
        String result = (age >= 11) ? (age <= 19 ?  "You are allowed teen." : "You are not allowed! Young Adult.") : ("You are not allowed child");
        System.out.println(result);
        System.out.println();

        System.out.println("By if-else Operator");
        if(requiredAge >= 11){
            if(requiredAge <= 19)
                System.out.println("You are allowed teen.");
            else {
                System.out.println("You are not allowed! Young Adult.");
            }
        }else {
            System.out.println("You are not allowed child");
        }



    }

}
