/*
    REQUIREMENTS:
        - To use addFirst(), addLast(), removeFirst(), removeLast(), peekFirst(), peekLast(), pollFirst(),
          pollLast() methods to store and retrieve elements in ArrayDequeue
    ENTITIES:
        - ArrayDequeDemo
    WORK TO BE DONE:
        - initialise a deque
        - insert elements at first
        - insert elements at last
        - remove elements at first
        - remove elements at last
        - get element at the first position
        - get element at the last position
*/

import java.util.ArrayDeque;
import java.util.Deque;

class ArrayDequeDemo {

    public static void main(String[] args) {

        Deque<String> colors = new ArrayDeque<>();

        System.out.println(colors);

        colors.addFirst("orange");
        System.out.println(colors);
        
        colors.addFirst("blue");
        System.out.println(colors);
        
        colors.addFirst("black");
        System.out.println(colors);
        
        colors.addLast("red");
        System.out.println(colors);
        
        colors.addLast("green");
        System.out.println(colors);
        
        colors.addLast("yellow");
        System.out.println(colors);

        colors.removeFirst();
        System.out.println(colors);
        colors.removeLast();
        System.out.println(colors);

        System.out.println(colors.peekFirst());
        System.out.println(colors.peekLast());

        colors.pollFirst();
        System.out.println(colors);
        
        colors.pollLast();
        System.out.println(colors);
    }
}
