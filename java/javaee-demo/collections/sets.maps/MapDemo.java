/*
    REQUIREMENTS:
        - To demonstrate java program to working of map interface using
            put()
            remove() 
            booleanContainsValue()
            replace()
    ENTITIES:
        - MapDemo
    WORK TO DONE:
        - create HashMap
        - add elements to it
        - remove element
        - check if key exists in map and value exists in map
        - replace the element in map with new element
    PSEUDOCODE:
        {
            In the main function

            create a hashmap called fruits
            put elements to fruits
            print fruits

            remove element from fruits

            check whether the fruits contains the element with the key
            check whether the fruits contains the element with the value
            print the results

            replace the element in the fruits
            print fruits
        }
*/

import java.util.Map;
import java.util.HashMap;

class MapDemo {

    public static void main(String[] args) {
      
        Map<Integer, String> fruits = new HashMap();

        fruits.put(1, "guava");
        fruits.put(2, "pineapple");
        fruits.put(3, "banana");
        fruits.put(4, "apple");

        System.out.println(fruits);

        fruits.remove(3);

        System.out.println(fruits);

        boolean hasId = fruits.containsKey(3);
        System.out.println(hasId);

        boolean hasApple = fruits.containsValue("apple");
        System.out.println(hasApple);

        fruits.replace(4, "star_fruit");
        System.out.println(fruits);
    }
}
