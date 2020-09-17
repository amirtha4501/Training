// Method reference is a shorthand notation of a lambda expression to call a method.
/*
    REQUIREMENTS:
        - To write a program for each types of method reference
    ENTITIES:
        - StaticMethodReference
    METHOD SIGNATURE:
        - static void printName(String name);
    WORK TO BE DONE:
        - create a method that prints the value
        - call the method using reference in forEach()
*/

import java.util.List;
import java.util.Arrays;

class StaticMethodReference {

    static void printName(String name) {
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("ammu", "jimmu", "pappu", "appu");

        names.forEach(StaticMethodReference::printName);
    }
}
