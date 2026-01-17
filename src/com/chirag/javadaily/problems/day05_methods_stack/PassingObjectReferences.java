package com.chirag.javadaily.problems.day05_methods_stack;
/**
 * 3️⃣ Passing Object References
 * Write a program that:
 * passes an object to a method
 * modifies its fields inside the method
 * Print object state before and after the method call.
 *
 * Actual Output
 * First Name Prince
 * Salary 100000
 * First Name Aadesh
 * Salary 200000
 *
 * Expected Output
 *
 * Observation
 * In Java, object references are passed by value.
 * The method receives a copy of the reference, so modifying the object's
 * fields affects the original object, but reassigning the reference does not.
 *
 * 🧠 One-Line Interview Answer (MEMORIZE)
 * Java is pass-by-value; for objects, the value passed is the reference, which allows modification of object state but not reassignment.
 *
 */

public class PassingObjectReferences {

    String firstName = "Prince";
    int salary = 100000;
    public void modifyObj(PassingObjectReferences obj){
        obj.firstName = "Aadesh";
        obj.salary = 200000;
    }

    public static void main(String[] args) {
        PassingObjectReferences obj = new PassingObjectReferences();
        System.out.println("First Name " + obj.firstName);
        System.out.println("Salary " + obj.salary);
        System.out.println();
        obj.modifyObj(obj);
        System.out.println("First Name " + obj.firstName);
        System.out.println("Salary " + obj.salary);
    }
}
