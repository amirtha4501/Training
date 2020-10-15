/*
    REQUIREMENTS:
        - To code a functional program that can return the sum of elements of varArgs, passed into the 
          method of functional interface.
    ENTITIES:
        - VarArgsDemo
    METHOD SIGNATURE:
        - int calculateSum(int... numbers);
    WORK TO BE DONE:
        - create an functional interface with method signature calculateSum(int... numbers); with return type int
        - write a lambda expression that returns the total.
*/

import java.lang.FunctionalInterface;

@FunctionalInterface
interface VarArgsInterface {
    int calculateSum(int... numbers);
}


class VarArgsDemo {

    public static void main(String[] args) {
        
        VarArgsInterface intAdder;

        intAdder = (int... numbers) -> {
            int total = 0;
            for (int number: numbers) {
                total += number;
            }
            return total;
        };

        System.out.println("Sum is " + intAdder.calculateSum(4, 5));
    }
}
