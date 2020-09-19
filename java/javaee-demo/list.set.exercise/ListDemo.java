/*
    REQUIREMENTS:
        - To create a list
            => Add 10 values in the list
            => Create another list and perform addAll() method with it
            => Find the index of some value with indexOf() and lastIndexOf()
    ENTITIES:
        - ListDemo
    WORK TO BE DONE:
        - create a list and add elements to it
        - create a new list and get its element from a list with addAll() method
        - display the values in the new list
        - use indexOf() and lastIndexOf() method to find index and print
*/

import java.util.ArrayList;
import java.util.List;

class ListDemo {
    
    public static void main(String[] args) {
        List<Integer> listSender = new ArrayList<Integer>();  
        List<Integer> listReceiver = new ArrayList<Integer>();  

        for (int i = 1; i <= 10; i++) {
            listSender.add(i);
        }

        System.out.println("Sender: " + listSender);
        System.out.println("Receiver: " + listReceiver);

        listReceiver.addAll(listSender);
        System.out.println("Receiver after addAll(): " + listSender);

        listSender.add(5);
        System.out.println("\nSender " + listSender + "\nindexOf(5): " + listSender.indexOf(5));
        System.out.println("lastIndexOf(5): " + listSender.lastIndexOf(5));
    }
}
