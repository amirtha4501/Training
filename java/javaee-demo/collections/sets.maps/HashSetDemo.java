/*
    REQUIREMENTS:
        - To demonstrate adding elements, displaying, removing, and iterating in hash set
        - To demonstrate program explaining basic add and traversal operation of linked hash set
        - To demonstrate linked hash set to array() method in java
        - To demonstrate insertions and string buffer in tree set
    ENTITIES:
        - HashSetDemo
    WORK TO DONE:
        - create a hashset
        - add elements to hashset
        - remove element from hashset
        - print elements in hashset with foreach loop
        - create, add and traverse linked hash set
        - create linked hash set and convert to an array using toArray() method
        - create tree set and add values to it
*/

import java.util.HashSet;
import java.util.LinkedHashSet;  
import java.util.TreeSet;  

class HashSetDemo {

    public static void main(String[] args) {
        
        /* To demonstrate adding elements, displaying, removing, and iterating in hash set */
        HashSet<String> mobiles = new HashSet<>();

        mobiles.add("oppo");
        mobiles.add("vivo");
        mobiles.add("redme");
        mobiles.add("samsung");

        System.out.println(mobiles);

        mobiles.remove("redme");

        for (String mobile: mobiles) {
            System.out.print(mobile + " ");
        }

        /* To demonstrate program explaining basic add and traversal operation of linked hash set */

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);
        numbers.add(10); // not added 
        numbers.add(20);

        System.out.println("\n" + numbers);

        for (Integer number: numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        /* To demonstrate linked hash set to array() method in java */

        Object[] arrayNumbers = numbers.toArray();
        
        for (Object arrayNumber: arrayNumbers) {
            System.out.print(arrayNumber + " ");
        }

        /* To demonstrate insertions and string buffer in tree set */

        TreeSet<String> juices = new TreeSet<>();

        juices.add("cavin's milk");
        juices.add("fruity");
        juices.add("maaza");

        /* 
            If we try to use string buffer in tree set, it will throw an exception called Class cast exception.
            Because, StringBuffer class doesn’t implements Comparable interface.
        */
    }
}
