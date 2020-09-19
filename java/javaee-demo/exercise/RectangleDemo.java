/*
    REQUIREMENTS:
        - To write a program to print the volume of a Rectangle using lambda expression.
    ENTITIES:
        - RectangleDemo
    METHOD SIGNATURE:
        - float calculateVolume(float length, float height, float width);
    WORK TO BE DONE:
        - create an functional interface with method signature calculateVolume(length, height, width) with return type float
        - write a lambda expression that returns the vplume.
*/

import java.lang.FunctionalInterface;

@FunctionalInterface
interface RectangleInterface {
    float calculateVolume(float length, float height, float width);
}


class RectangleDemo {

    public static void main(String[] args) {
        
        RectangleInterface calculator;

        calculator = (length, height, width) -> {
            return length * height * width;
        };
        System.out.println("The volume of a rectangle is: " + calculator.calculateVolume(4, 2, 8));
    }
}
