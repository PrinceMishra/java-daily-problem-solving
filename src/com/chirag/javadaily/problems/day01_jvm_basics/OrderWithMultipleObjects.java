package com.chirag.javadaily.problems.day01_jvm_basics;

/**
 *
 * 8️⃣ Order With Multiple Objects
 * Write a program where:
 * static block exists
 * instance block exists
 * constructor exists
 * two objects are created inside main()
 * Record and compare the execution order.
 *
 * Expected Output
 * In static block!
 * In instance block!
 * obj1 is created.
 * In instance block!
 * obj2 is created.
 *
 * Actual Output
 *In static block!
 * In instance block!
 * obj1 is created.
 * In instance block!
 * obj2 is created.
 *
 * Observation
 * Static block executes once during class initialization, before main().
 * main() is the JVM entry point, invoked after class initialization.
 * On every object creation:
 *    - Memory is allocated in the heap
 *    - Instance initialization block executes
 *    - Constructor body executes
 * Instance blocks run before constructor logic for every object.
 */
public class OrderWithMultipleObjects {

    // static block loads on class loading and runs before main()
    static{
        System.out.println("In static block!");
    }
   // Instance block which runs before constructor logic
    {
        System.out.println("In instance block!");
    }
    // constructor runs when object created
    OrderWithMultipleObjects(int x){
        System.out.println("obj"+x+" is created.");
    }

    // main() is the JVM entry point method from where program execution begins after class initialization.
    public static void main(String[] args) {

        // two objects are created here obj1 and obj2
        OrderWithMultipleObjects obj1 = new OrderWithMultipleObjects(1);
        OrderWithMultipleObjects obj2 = new OrderWithMultipleObjects(2);
    }


}


