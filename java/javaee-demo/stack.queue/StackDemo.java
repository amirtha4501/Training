/*
    REQUIREMENTS:
        - To  Create a stack using generic type and implement
            -> Push atleast 5 elements
            -> Pop the peek element
            -> search a element in stack and print index value
            -> print the size of stack
            -> print the elements using Stream
    ENTITIES:
        - StackDemo
    WORK TO DONE:
        - push atleast 5 elements
        - pop the peek element
        - search a element in stack and print index value
        - print the size of stack
        - print the elements using Stream
*/

import java.util.Stack;
import java.util.stream.Stream;

class StackDemo {

    public static void main(String[] args) {
        
        Stack<String> chips = new Stack<String>();

        chips.push("lays");
        chips.push("kurkure");
        chips.push("bingo");
        chips.push("cheetos");
        chips.push("tangles");

        String peek = chips.pop();
        System.out.println("Lastly added chips: " + peek);
        
        int indexOfKurkure = chips.search("kurkure");
        System.out.println("Kurkure's location: " + indexOfKurkure);
        
        int chipsSize = chips.size();
        System.out.println("Chips size: " + chipsSize);

        Stream stream = chips.stream();

        stream.forEach((chip) -> {
            System.out.print(chip + " ");
        });
    }
}
