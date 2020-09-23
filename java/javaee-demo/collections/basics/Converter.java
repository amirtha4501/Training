/*
    REQUIREMENTS:
        - To convert lements to UPPERCASE
          [Madurai, Coimbatore, Theni, Chennai, Karur, Salem, Erode, Trichy] 
    ENTITIES:
        - Converter
    WORK TO BE DONE:
        - initialise a list
        - add elements to the list
        - iterate over the list
            -> if element starts with a or A, print the element
*/

import java.util.List;
import java.util.ArrayList;

class Converter {

    public static void main(String[] args) {
        
        List<String> places = new ArrayList<String>();
        places.add("Madurai");
        places.add("Coimbatore");
        places.add("Theni");
        places.add("Chennai");
        places.add("Karur");
        places.add("Salem");
        places.add("Erode");
        places.add("Trichy");

        for(String place: places) {
            System.out.println(place.toUpperCase());
        }
    }
}
