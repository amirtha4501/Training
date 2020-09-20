/*
    REQUIREMENTS:
        - To create an array list with 7 elements, and create an empty linked list add all elements 
          of the array list to linked list ,traverse the elements and display the result
    ENTITIES:
        - ArrayLinkedDemo
    WORK TO BE DONE:
        - create an array of 7 elements
        - create a linked list 
        - Iterate through the items in the ArrayList.
            -> for each item, add it to the linked list
        - display the list
*/

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

class ArrayLinkedDemo {

    public static void main(String[] args) {
        
        List<String> arrayList = Arrays.asList("bulb", "tube light", "LED");
        System.out.println("arrayList");
        
        for(String element: arrayList) {
            System.out.println(element);
        }
        
        List<String> linkedList = new LinkedList<>(arrayList);
        System.out.println("\nlinkedList");
        
        for(String element: linkedList) {
            System.out.println(element);
        }
    }
}