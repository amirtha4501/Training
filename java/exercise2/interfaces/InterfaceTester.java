/*
REQUIREMENTS:
        - To find and fix the error
    ENTITY: 
        - InterfaceTester
    METHOD SIGNATURE:
       - void aMethod(int aValue);
*/

package in.kpriet.training.java.interfaces;

interface SomethingIsWrong {

    static void aMethod(int aValue){
        System.out.println("Hi! I'm from Interface.");
    }
}

class InterfaceTester implements SomethingIsWrong {
    
    public static void main(String[] args) {
        SomethingIsWrong.aMethod(1);
    }
}

/* 
    - In an interface, there can be a method definition if and only if it's a default or static method 
    - Here, the fix is to add the static keyword to the method that is defined in the 
      interface and hence it can't be overriden by the class that implements it.
*/
