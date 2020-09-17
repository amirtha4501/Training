/*
    REQUIREMENTS:
        - To write a program for each types of method reference
    ENTITIES:
        - InstanceMethodReference
    METHOD SIGNATURE:
        - static void printName(String name);
    WORK TO BE DONE:
        - create a method that compare integers inside inner class
        - call the method using reference
*/

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class InstanceMethodReference {

    public static void main(String args[]) {
    
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Comparison comparison = new Comparison();
        
        Collections.sort(numbers, comparison::compare);
    }
    
    static class Comparison {
        int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    }
}