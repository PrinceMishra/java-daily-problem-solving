package com.chirag.javadaily.problems.day02_datatypes;
/**
 *
 * 5️⃣ Default Values of Variables
 *
 * Declare class-level variables of all primitive data types.
 * Print their default values.
 *
 * Actual Output
 *Default value of int is 0
 * Default value of long is 0
 * Default value of float is 0.0
 * Default value of double is 0.0
 * Default value of char is empty
 * Default value of boolean is false
 *
 * Expected Output
 *Default value of int is 0
 * Default value of long is 0
 * Default value of float is 0.0
 * Default value of double is 0.0
 * Default value of char is null
 * Default value of boolean is false
 *
 * Observation
 * Class-level variables (static and instance) are automatically initialized
 * by the JVM during class loading or object creation.
 *
 * Primitive variables receive default values such as 0, 0.0, false, or '\u0000'
 * for char. Primitives are never null.
 *
 * Local variables do not receive default values and must be explicitly initialized.
 *
 * **Only class-level variables get default values in Java; local variables do not.
 */

public class DefaultValuesOfVariables {

//   instance variable default value
//    static byte b ;
//    static short s;
//    static int i;
//    static long l;
//    static float f;
//    static double d;
//    static char c;
//    static boolean bl;


//   instance variable default value
     byte b ;
     short s;
     int i;
     long l;
     float f;
     double d;
     char c;
     boolean bl;



    public static void main(String[] args) {

//        static variable default value
//        System.out.println("Default value of byte is "+DefaultValuesOfVariables.b);
//        System.out.println("Default value of short is "+DefaultValuesOfVariables.s);
//        System.out.println("Default value of int is "+DefaultValuesOfVariables.i);
//        System.out.println("Default value of long is "+DefaultValuesOfVariables.l);
//        System.out.println("Default value of float is "+DefaultValuesOfVariables.f);
//        System.out.println("Default value of double is "+DefaultValuesOfVariables.d);
//        System.out.println("Default value of char is "+DefaultValuesOfVariables.c);      // '\u0000' Unicode null character
//        System.out.println("Default value of boolean is "+DefaultValuesOfVariables.bl);

//      Instance variables default value
        DefaultValuesOfVariables obj1 = new DefaultValuesOfVariables();
        System.out.println("Default value of byte is "+obj1.b);
        System.out.println("Default value of short is "+obj1.s);
        System.out.println("Default value of int is "+obj1.i);
        System.out.println("Default value of long is "+obj1.l);
        System.out.println("Default value of float is "+obj1.f);
        System.out.println("Default value of double is "+obj1.d);
        System.out.println("Default value of char is "+obj1.c);      // '\u0000' Unicode null character
        System.out.println("Default value of boolean is "+obj1.bl);

    }
}
