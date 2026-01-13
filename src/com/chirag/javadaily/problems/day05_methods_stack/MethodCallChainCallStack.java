package com.chirag.javadaily.problems.day05_methods_stack;

/**
 * 1️⃣ Method Call Chain (Call Stack)
 *
 * Write a program with the following method call flow:
 * main → m1 → m2 → m3
 *
 * Each method must print:
 * when it is entered
 * when it is exited
 */

public class MethodCallChainCallStack {

    public int m1(int x1){
        System.out.println("Entered m1");
        int resM1 = m2(x1 + 1);
        System.out.println("Getting out m1");
        return resM1;
    }
    public int m2(int x2){
        System.out.println("Entered m2");
        int resM2 = m3(x2 + 2);
        System.out.println("Getting out m2");
        return resM2;
    }
    public int m3(int x3){
        System.out.println("Entered m3");
        int resM3 = x3 + 3;
        System.out.println("Getting out m3");
        return resM3;
    }
    public static void main(String[] args) {
        System.out.println("Entered main");
        MethodCallChainCallStack obj1 = new MethodCallChainCallStack();
        obj1.m1(5);
        System.out.println("Getting out main");
    }

}
