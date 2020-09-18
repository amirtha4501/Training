/*
    REQUIREMENTS:
        - To write a program to demonstrate generics method
    ENTITIES:
        - GenericMethodDemo 
        - Algorithm
        - OddPredicate
        - UnaryPredicate
    METHOD SIGNATURE:
        - boolean checker(T input);
        - public static <T> int countIf(inputs);
    WORK TO BE DONE:
        - create unarypredicate interface with a method checker
        - create a class called Algorithm which iterates and returns the count
        - create a class called OddPredicate which returns whether the number is odd or not to Algorithm class
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

interface UnaryPredicate<T> {
    boolean checker(T input);
}


class Algorithm {
    public static <T> int countIf(Collection<T> collection, UnaryPredicate<T> predicate) {
        int count = 0;
        
        for (T element : collection) {
            if (predicate.checker(element)) { ++count; }
        }
        return count;
    }
}


class OddPredicate implements UnaryPredicate<Integer> {
    public boolean checker(Integer i) { return i % 2 != 0; }
}


class GenericMethodDemo {
    public static void main(String[] args) {
        Collection<Integer> collectionInput = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(collectionInput, new OddPredicate());
        System.out.println("Odd numbers count: " + count);
    }
}
