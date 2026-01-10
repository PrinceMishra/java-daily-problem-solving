package com.chirag.javadaily.problems.day03_operators;

/**
 *5️⃣ Nested Ternary Operator
 *
 * Write a program using nested ternary operators to evaluate a condition.
 * Rewrite the same logic using if-else.
 *
 * Actual Output
 *
 * Expected Output
 *
 * Observation
 *
 *
 */

public class NestedTernaryOperator {

    public static void main(String[] args) {

        int age = 16;
        int requiredAge = 18;

        String result = age < 18 ? age >= 16 ?  "You are allowed teen." : "You are not allowed! Good luck next time";


        if(age < 18){
            if(age >= 16)
                System.out.println("You are allowed teen.");
        }else {
            System.out.println("You are not allowed! Good luck next time");
        }



    }

}
