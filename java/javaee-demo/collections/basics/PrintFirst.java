/*
    REQUIREMENTS:
        - To display only names starting with 'A'
          [krishnan, abishek, arun, vignesh, kiruthiga, murugan, adhithya, balaji, vicky, priya] 
    ENTITIES:
        - PrintFirst
    WORK TO BE DONE:
        - initialise a list
        - add elements to the list
        - iterate over the list
            -> if element starts with a or A, print the element
*/

import java.util.List;
import java.util.ArrayList;

class PrintFirst {

    public static void main(String[] args) {
        
        List<String> names = new ArrayList<String>();
        names.add("krishnan");
        names.add("abishek");
        names.add("arun");
        names.add("vignesh");
        names.add("kiruthiga");
        names.add("murugan");
        names.add("adhithya");
        names.add("balaji");
        names.add("vicky");
        names.add("priya");

        for(String name: names) {
            if(name.startsWith("A") || name.startsWith("a")) {
                System.out.println(name);
            }
        }
    }
}
