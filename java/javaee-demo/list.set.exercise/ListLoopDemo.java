/*
    REQUIREMENTS:
        - Create a list 
            => Print the values in the list using 
                - For loop
                - For Each
                - Iterator
                - Stream API
    ENTITIES:
        - ListLoopDemo
    WORK TO BE DONE:
        - create a list and add elements to it
        - use simple for loop to print the list elements
        - use enhanced for loop to print the list elements
        - use iterator to print the list elements
        - use stream() to print the list elements
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class ListLoopDemo {

    public static void main(String[] args) {
        
        List<String> names = new ArrayList<String>();

        names.add("Ammu");
        names.add("Jimmu");
        names.add("Pappu");
        names.add("Appu");
        names.add("Ammu");

        System.out.println("\nFor loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }

        System.out.println("\n\nEnhanced for loop");
        for (String name: names) {
            System.out.print(name + " ");
        }

        System.out.println("\n\nIterator");
        for (Iterator<String> name = names.iterator(); name.hasNext();) {
            System.out.print(name.next() + " ");
        }

        System.out.println("\n\nUsing stream");
        names.stream().forEach((name) -> System.out.print(name + " "));
    }
}
