package com.chirag.javadaily.problems.day03_operators;

/**
 * 4️⃣ Equality vs Object Equality
 * Write a program where:
 * == returns false
 * .equals() returns true
 *
 * Then write another program where:
 * == returns true
 * .equals() returns false
 *
 * Actual Output
 * First Name = Prince
 * Last Name = Prince
 *
 * First Option
 * Prince's value with data type equals Prince
 *
 * Second Option
 * x == y
 * Prince's value with data type equals Prince
 *
 * Expected Output
 *
 * Observation
 * The == operator compares object references (memory addresses),
 * while equals() compares object content as defined by the class.
 *
 * For well-designed classes, if == returns true, equals() must also return true.
 * A scenario where == is true and equals() is false violates the equality contract
 * and should never occur in correctly written Java classes.
 *
 */

public class EqualityVsObjectEquality {

    public static void main(String[] args) {

        String firstName = "Prince";
        String secondName = new String("Prince");
        String thirdName = firstName;

        System.out.println("First Name = " + firstName);
        System.out.println("Last Name = " + secondName);
        System.out.println();

//         == returns false
//         .equals() returns true
        System.out.println("First Option");

        if(firstName == secondName) // condition is false
        {
            System.out.println("x == y");
        }
        if (firstName.equals(secondName)) // condition is true
        {
            System.out.println(firstName + "'s value with data type equals " +secondName  );
        }
        System.out.println();

//        == returns true
//        .equals() returns false
//        == returns true, .equals() returns false ❌ (IMPOSSIBLE)

        System.out.println("Second Option");
        if(firstName == thirdName) // condition is false
        {
            System.out.println("x == y");
        }
        if (firstName.equals(thirdName)) // condition is true
        {
            System.out.println(firstName + "'s value with data type equals " +thirdName  );
        }
    }

}
