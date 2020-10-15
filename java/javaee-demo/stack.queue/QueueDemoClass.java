/*
    REQUIREMENTS:
        - To create a queue using generic type and in both implementation Priority Queue,Linked list and complete following  
            -> add atleast 5 elements
            -> remove the front element
            -> search a element in queue using contains key word and print boolean value value
        - To find output for:
            Queue bike = new PriorityQueue();    
            bike.poll();
            System.out.println(bike.peek()); 
    ENTITIES:
        - QueueDemo
    WORK TO DONE:
        - create a queues (priority queue, linked list)
            -> add 5 elements with add()
            -> remove the front element with remove()
            -> search a element in queue using contains key word and print boolean value value
*/

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.stream.Stream;

class QueueDemoClass {

    public static void main(String[] args) {
        
        Queue<String> chipsQueue = new PriorityQueue<String>();
        Queue<String> chipsLinked = new LinkedList<String>();

        chipsQueue.add("lays");
        chipsQueue.add("kurkure");
        chipsQueue.add("bingo");
        chipsQueue.add("cheetos");
        chipsQueue.add("tangles");

        chipsLinked.add("lays");
        chipsLinked.add("kurkure");
        chipsLinked.add("bingo");
        chipsLinked.add("cheetos");
        chipsLinked.add("tangles");

        System.out.println(chipsQueue);
        System.out.println(chipsLinked);

        chipsQueue.remove();
        chipsLinked.remove();

        System.out.println(chipsQueue);
        System.out.println(chipsLinked);

        boolean containsFuzzy = chipsQueue.contains("fuzzy");
        boolean containsLays = chipsLinked.contains("kurkure");

        System.out.println(containsFuzzy);
        System.out.println(containsLays);

        Queue<?> bike = new PriorityQueue<Object>();    
        bike.poll();
        System.out.println(bike.peek()); // null
    }
}
