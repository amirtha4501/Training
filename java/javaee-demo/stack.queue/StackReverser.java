/*
    REQUIREMENTS:
        - To reverse List Using Stack with minimum 7 elements in list.
    ENTITIES:
        - StackReverser
    WORK TO DONE:
        - create a list
        - add chips names into the list
        - create a stack
        - push the chips names into stack from list
        - pop the names from stack using for loop and print it.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class StackReverser {

    public static void main(String[] args) {
        
        List<String> chipsList = new ArrayList();
        Stack<String> chips = new Stack<String>();

        chipsList.add("lays");
        chipsList.add("kurkure");
        chipsList.add("bingo");
        chipsList.add("cheetos");
        chipsList.add("tangles");
        chipsList.add("puff_balls");
        chipsList.add("moong_dal");

        for (String chip: chipsList) {
            chips.push(chip);
            System.out.print(chip + " ");
        }

        System.out.println();

        for (int i = chips.size(); i > 0; i--) {
            String value = chips.pop();
            System.out.print(value + " ");
        }
    }
}
