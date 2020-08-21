/*
    REQUIREMENTS:
        - To sort the string array { "Madurai", "Thanjavur", "TRICHY", "Karur", "Erode", "trichy", "Salem" } alphabetically
        - To convert and print even indexed Strings into uppercase

    ENTITY: 
        - StringPrinter

    WORK TO BE DONE:
        - check the element with the succeeding one and if the next element is less than the element,
          swap the values with the use of temp variable while the elements should be in the
          same case when comparison occurs
        - check if the index is even with the help of modulo operator and if yes, convert the element to uppercase
*/

package in.kpriet.training.java.strings;

import java.util.Arrays;

class StringPrinter {

    static String[] places = { "Madurai", "Thanjavur", "TRICHY", "Karur", "Erode", "trichy", "Salem" };
    
    void sortArray(String[] places) {

        String temp;

        for(int i = 0; i <= places.length - 1; i++) {
            for(int j = i+1; j < places.length; j++) {
                if(places[i].toLowerCase().compareTo(places[j].toLowerCase()) > 0) {
                    temp = places[i];
                    places[i] = places[j];
                    places[j] = temp;
                }
            }
        }

        for(int i = 0; i <= places.length - 1; i++) {
            if(i % 2 == 0) {
                places[i] = places[i].toUpperCase();
            }
        }

        System.out.println(Arrays.toString(places));
    }

    public static void main(String[] args) {
        StringPrinter printer = new StringPrinter();
        printer.sortArray(places);
    }
}
