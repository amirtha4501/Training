/*
    REQUIREMENTS:
        - To explain about contains(), subList(), retainAll() with example
    ENTITIES:
        - ListMethodsDemo
    WORK TO BE DONE:
        - create lists and add elements to it
        - use retainAll() method
        - use contains() method
        - use subList() method
*/

import java.util.List;
import java.util.ArrayList;

class ListMethodsDemo {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<Integer>();
        List<Integer> values = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i + 1);
        }

        for (int i = 3; i < 8; i++) {
            values.add(i + 1);
        }
        
        System.out.print("numbers list: " + numbers + "\n");
        System.out.print("values list : " + values + "\n");

        values.retainAll(numbers);
        System.out.println("values list after retainAll: " + values);

        boolean contains1 = numbers.contains(1);
        boolean contains6 = numbers.contains(6);

        System.out.println("Numbers list contains 1? " + contains1);
        System.out.println("Numbers list contains 6? " + contains6);

        System.out.println("subList(1, 3): " + numbers.subList(1, 3));
    }
}

/*
    .contains() - checks whether the list contains the specified element or not.
                  If yes, prints true. Else, false.
    .subList(start index, end index) - from the start index of the first element till the end index excluding the 
                                       end index, the values are included in the sublist. 
    .retainAll() - gives the intersection of the two lists.

*/
