/*
    REQUIREMENTS:
        - To write a program to print difference of two numbers using lambda expression 
          and the single method interface.
    ENTITIES:
        - LambdaDemo
    METHOD SIGNATURE:
        String concatString(String firstName, String lastName);
    WORK TO BE DONE:
        - create an functional interface with method signature calculateDifference(number1, number2) with return type int
        - write a lambda expression that returns the difference.
*/

import java.lang.FunctionalInterface;

@FunctionalInterface
interface CalculatorInterface {
    
    int calculateDifference(int number1, int number2);
}


class LambdaDemo {

    public static void main(String[] args) {
        
        CalculatorInterface calculator;

        calculator = (number1, number2) -> {
            int difference = number1 - number2;
            if (difference < 0) { difference *= -1; }
            return difference;
        };

        System.out.println("The difference is: " + calculator.calculateDifference(4, 20));
    }
}