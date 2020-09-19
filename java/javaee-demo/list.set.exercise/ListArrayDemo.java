/*
    REQUIREMENTS:
        - To convert the list to a array
    ENTITIES:
        - ListArrayDemo
    WORK TO BE DONE:
        - create a list and add elements to it
        - create an array and get its element from a list with toArray() method
        - display the values
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class ListArrayDemo {

    public static void main(String[] args) {
        
        List<String> chocolatesList = new ArrayList<>();

        chocolatesList.add("Caramel");
        chocolatesList.add("Kopiko");
        chocolatesList.add("Guava");
        chocolatesList.add("Eclairs");
        
        String[] chocolatesArray = chocolatesList.toArray(new String[0]);

        for(String chocky: chocolatesList) {
            System.out.print(chocky + " ");
        }
        
        System.out.println();

        for(String chocky: chocolatesArray) {
            System.out.print(chocky + " ");
        }
    }
}
