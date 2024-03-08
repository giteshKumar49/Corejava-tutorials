package Lists;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Offer function put an element into the queue and returns true or false...
        // Similar to offer function we also have add function in queue but it will return false and throw an exception
        // if element was not added successfully into the queue. So we avoid the use of add(). But if say you want a functionality
        // that your app close abruptly if something is not added into the queue then use add() otherwise use offer().
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("queue = " + queue);

        // used to remove an element for the queue
        // Similar to poll function we also have remove() function in queue but it will return false and throw an exception
        // if element was not removed successfully into the queue. So we avoid the use of remove(). But if say you want a functionality
        // that your app close abruptly if something is not removed from the queue then use remove() otherwise use poll().
        System.out.println("queue.poll() = " + queue.poll());

        System.out.println("queue = " + queue);

        System.out.println("queue.peek() = " + queue.peek());
    }
}
