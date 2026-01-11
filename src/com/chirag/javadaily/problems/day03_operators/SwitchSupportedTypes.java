package com.chirag.javadaily.problems.day03_operators;
/**
 * 8️⃣ Switch Supported Types
 *
 * Write separate programs testing switch with:
 * byte
 * short
 * int
 * long
 * float
 * double
 * char
 * String
 * enum
 *
 * Record which compile and which fail.
 *
 * Actual Output
 * byte Second case
 * short First case
 * int First case
 * char Second case
 * Intelligent
 * It's friday night chill!!
 *
 * Expected Output
 *byte Second case
 * short First case
 * int First case
 * char Second case
 * Intelligent
 * It's friday night chill!!
 *
 * Observation
 * The switch statement in Java supports byte, short, char, int, enum,
 * and String (Java 7+), because these types can be safely mapped to int
 * values at compile time.
 *
 * Types like long, float, and double are not supported due to size and
 * precision issues.
 */

public class SwitchSupportedTypes {

    public static void main(String[] args) {

        // byte condition
        byte b = 2;
        switch(b){
            case 1 :
                System.out.println("byte First case");
                break;
            case 2 :
                System.out.println("byte Second case");
                break;
            case 3 :
                System.out.println("byte Third case");
                break;
        }
        // short case
        short s = 1;
        switch(s){
            case 1 :
                System.out.println("short First case");
                break;
            case 2 :
                System.out.println("short Second case");
                break;
            case 3 :
                System.out.println("short Third case");
                break;
        }

        // int case
        int i = 1;
        switch(i){
            case 1 :
                System.out.println("int First case");
                break;
            case 2 :
                System.out.println("int Second case");
                break;
            case 3 :
                System.out.println("int Third case");
                break;
        }


        // long case will wail
//        long l = 3;
//        switch(l){
//            case 1 :
//                System.out.println("int First case");
//                break;
//            case 2 :
//                System.out.println("int Second case");
//                break;
//            case 3 :
//                System.out.println("int Third case");
//                break;
//        }


//        float f = 3.1f;
//        switch(f){
//            case 3.1f :
//                System.out.println("int First case");
//                break;
//            case 3.2f :
//                System.out.println("int Second case");
//
//            case 3.3f :
//                System.out.println("int Third case");
//        }



        // double case will wail

//        double d = 3.1;
//        switch(d) {
//            case 3.1f:
//                System.out.println("int First case");
//                break;
//            case 3.2f:
//                System.out.println("int Second case");
//                break;
//            case 3.3f:
//                System.out.println("int Third case");
//                break;
//        }

        char ch = 'b';
        switch(ch){
            case 'a' :
                System.out.println("char First case");
                break;
            case 'b' :
                System.out.println("char Second case");
                break;
            case 'c' :
                System.out.println("char Third case");
                break;
        }

        String str = "Prince";
        switch(str){
            case "Prince" :
                System.out.println("Intelligent");
                break;
            case "Aadesh" :
                System.out.println("Blunder");
                break;
            case "Satyam" :
                System.out.println("By Mistake");
                break;
        }

         enum weekDays {
            sunday,
            monday,
            tuesday,
            wednesday,
            thursday,
            friday,
            saturday,
        }

        weekDays today = weekDays.friday;

        switch (today){
            case sunday:
                System.out.println("It's Holiday");
                break;
            case monday:
                System.out.println("It,s working day");
                break;
            case saturday:
                System.out.println("Weekend start");
                break;
            case friday:
                System.out.println("It's friday night chill!!");
                break;
        }
    }
}
