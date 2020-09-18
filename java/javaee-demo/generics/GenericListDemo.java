/*
    REQUIREMENTS:
        - To write a program to demonstrate generics - for loop, for list
    ENTITIES:
        - GenericListDemo 
    WORK TO BE DONE:
        - create a generic list called numbers which is of type Integer
        - add elements to the list
        - iterate over the list 
*/

import java.util.List;
import java.util.ArrayList;

class GenericListDemo {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i + 1);
        }

        int luckyNumber = numbers.get(3);
        System.out.println(luckyNumber);
        
        for (Integer number: numbers) {
            System.out.print(number);
        }
    }
}
