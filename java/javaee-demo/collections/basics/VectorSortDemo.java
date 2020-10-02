/*
    REQUIREMENTS:
        - To write code for sorting vector list in descending order
    ENTITIES:
        - VectorSortDemo
    WORK TO BE DONE:
        - create a vector list
        - add elements to it
        - compare and sort the list
        - display the elements 
    PSEUDOCODE:
        {
            In the main function

            create a vector called cycles

            add elements to the vector
            print the result

            Create comparator
            sort it by giving vector and comparator
            print the result
        }
*/

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

class VectorSortDemo {

    public static void main(String[] args) {
        
        Vector<String> cycles = new Vector<String>();

        cycles.add("mountain");
        cycles.add("hero");
        cycles.add("hercules");
        cycles.add("viva");

        System.out.println(cycles);
        Comparator comparator = Collections.reverseOrder();

        Collections.sort(cycles, comparator);
        System.out.println(cycles);

    }
}
