/*
    REQUIREMENTS:
        - To explain the class variables
        - To explain the instance variables
        - To find output for the given code
    ENTITY: 
        - IdentifyMyParts
    WORK TO BE DONE:
        - If a variable is declared in a class with static keyword and outside the constructor and method,
          then it is a class variables 
        - If a variable is created when an object is created, this it is a instance variables
        - Check the output of question 2
*/

package in.kpriet.training.java.classes.objects;

public class IdentifyMyParts {
        public static int x = 7; // class variable
        public int y = 3; // instance variable

    public static void main(String[] args) {

        IdentifyMyParts identify1 = new IdentifyMyParts();
        IdentifyMyParts identify2 = new IdentifyMyParts();

        // Class variables example

        System.out.println("\nx value from obj1 is " + identify1.x); // 7
        System.out.println("x value from obj2 is " + identify2.x);   // 7

        identify1.x = 10; // changing x variable's value to 10

        System.out.println("\nx value from obj1 after change is " + identify1.x); // 10
        System.out.println("x value from obj2 after change is " + identify2.x);   // 10

        System.out.println("\nx value using class name " + IdentifyMyParts.x); // 10

        // Instance variable example

        System.out.println("\ny value from obj1 is " + identify1.y); // 3
        System.out.println("y value from obj2 is " + identify2.y);   // 3

        identify1.y = 15; // changing y variable's value to 15

        System.out.println("\ny value from obj1 after change is " + identify1.y); // 15
        System.out.println("y value from obj2 after change is " + identify2.y);   // 3

        // Question 2
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        
        a.y = 5; // change y value to 5
        b.y = 6; // change y value to 6
        a.x = 1; // change x to 1
        b.x = 2; // change x to 2
        
        System.out.println("\na.y = " + a.y); // 5 
        System.out.println("b.y = " + b.y);   // 6
        System.out.println("a.x = " + a.x);   // 2
        System.out.println("b.x = " + b.x);   // 2
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x); // 2
    }
}
    
/* 
        - Class variables are common to all instances of a class.
        - If the value of a variable is changed by one object, it will reflect in another.
        - It can be accessed with either class name or object name.

        - Instance variables will differ to each instance of a class.
        - If the value of a variable is changed by one object, it will not affect another.
          Because, each object has its own copy of instance variables.
        - It can be accessed with only object name.
*/
