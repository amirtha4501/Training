/*
    REQUIREMENTS:
        - To create a set
            => Add 10 values
            => Perform addAll() and removeAll() to the set.
            => Iterate the set using 
                - Iterator
                - for-each
    ENTITIES:
        - SetDemo
    WORK TO BE DONE:
        - create a set and add elements to it
        - add all elements of set one to another using addAll() method
        - use retainAll() method to get the intersection
        - print the values using enhanced for loop and Iterator
*/

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

class SetDemo {

    public static void main(String[] args) {
        
        Set chocolatesSet = new HashSet();
        Set snackSet = new HashSet();
        
        for (int i = 0; i < 2; i++) {            
            chocolatesSet.add("Milky bar: " + (i + 1));
            chocolatesSet.add("Guava: " + (i + 1));
            chocolatesSet.add("Dairy Milk: " + (i + 1));
            chocolatesSet.add("Kopiko: " + (i + 1));
            chocolatesSet.add("Guava: " + (i + 1));
        }

        System.out.println();

        // For each loop
        for (Object chocky: chocolatesSet) {
            System.out.println(chocky);
        }

        snackSet.addAll(chocolatesSet); // Add all method

        System.out.println();

        // Iterator
        Iterator<String> iterator = snackSet.iterator();
        
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        snackSet.add("Chips");
        snackSet.add("Pizza");

        snackSet.removeAll(chocolatesSet); // Remove all method

        System.out.println("\nSnacks set after removing chocolates set");

        for (Object snack: snackSet) {
            System.out.println(snack);
        }
    }
}
