/*
    REQUIREMENTS:
        - To differentiate poll() and remove() method of queue interface
    ENTITIES:
        - QueueDemo
    WORK TO BE DONE:
        - create a queue
        - add elements to it
        - remove element using poll() method
        - remove element using remove() method
        - print the result
*/

import java.util.Queue;
import java.util.LinkedList;

class QueueDemo {

    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        // queue.add("element 1");
        // queue.add("element 2");
        System.out.println(queue);

        String element1 = queue.poll();
        System.out.println(queue);
        System.out.println(element1);

        String element2 = queue.remove();
        System.out.println(queue);
        System.out.println(element2);
    }
}

/*
    - poll() and remove() method in queue, removes the first element in queue.
    - poll() returns null, if there is no element in the queue
    - remove() throws an exception called NoSuchElementException, if there is no element in the queue
*/
