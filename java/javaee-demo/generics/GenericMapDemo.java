/*
    REQUIREMENTS:
        - To write a program to demonstrate generics - Map
    ENTITIES:
        - GenericMapDemo 
    WORK TO BE DONE:
        - create a generic Map called members 
        - add keys, values to the Map
        - iterate over the Map 
*/

import java.util.Map;
import java.util.HashMap;

class GenericMapDemo {

    public static void main(String[] args) {
        
        Map<Integer, String> members = new HashMap<>();

        members.put(1, "ammu");
        members.put(2, "jimmu");
        members.put(3, "anu");
        members.put(4, "appu");

        System.out.println(members);

        for(Integer number: members.keySet()) {
            String name = members.get(number);
            System.out.println(number + ":" + name);
        }
    }
}
