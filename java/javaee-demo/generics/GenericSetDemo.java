/*
    REQUIREMENTS:
        - To write a program to demonstrate generics - set
    ENTITIES:
        - GenericSetDemo 
    WORK TO BE DONE:
        - create a generic Set called numbers which is of type Integer
        - add elements to the Set
        - iterate over the Set 
*/

import java.util.Set;
import java.util.HashSet;

class GenericSetDemo {

    public static void main(String[] args) {
        
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i + 1);
        }

        for (Integer number: numbers) {
            System.out.print(number);
        }
    }
}
