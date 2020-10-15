/*
    REQUIREMENTS:
        - To write a Java program to copy all of the mappings from the specified map to another map
        - To write a Java program to test if a map contains a mapping for the specified key
    ENTITIES:
        - MapDemo
    WORK TO DONE:
        - create two hashmaps
        - add elements to it
        - copy elements of one to another
        - check if map contains element with a specified key using containsKey
        - count the size of mappings in a map using size()
        - create a treemap and add elements to it
        - get a range of elements using subMap(from, to) method
*/

import java.util.HashMap;
import java.util.TreeMap;
import java.util.SortedMap;

class MapDemoClass {

    public static void main(String args[]) {  
    
        HashMap<Integer, String> source = new HashMap<Integer, String>();
        HashMap<Integer, String> destination = new HashMap<Integer, String>();
        TreeMap<Integer, String> rangeMap = new TreeMap<Integer, String>();
        SortedMap<Integer, String> newMap = new TreeMap<Integer, String>();
    
        source.put(1, "India");
        source.put(2, "Africa");
        source.put(3, "Antartica");
        System.out.println("Source: " + source);
        
        destination.put(4, "America");
        destination.put(5, "New Zealand");
        destination.put(6, "Mauritious");
        System.out.println("destination: " + destination);

        destination.putAll(source);
        System.out.println("after copying: " + destination);

        System.out.println(source.containsKey(1));
        System.out.println(source.containsKey(5));
        
        System.out.println(source.size());

        rangeMap.put(2, "basket ball");
        rangeMap.put(3, "hand ball");
        rangeMap.put(4, "volley ball");
        rangeMap.put(1, "foot ball");
        
        newMap = rangeMap.subMap(2, 4);
        System.out.println(newMap);
    }
}
