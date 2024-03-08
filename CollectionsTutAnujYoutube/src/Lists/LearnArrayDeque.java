package Lists;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        // ArrayDeque --> Doubly Ended queue ie. we can add, peek and remove elements from both ends of the queue.
        // Mostly used in Sliding window technique.

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); // adds element at last of the deque ie. normal queue behaviour
        System.out.println("adq = " + adq); // adq = [23]
        
        adq.offerFirst(12); // Adds element from front side
        System.out.println("adq = " + adq); //adq = [12, 23]

        adq.offerLast(45); // similar to offer function only difference is that offerLat came from ArrayDeque class
                              // and offer function came from queue interface..
        System.out.println("adq = " + adq); //adq = [12, 23, 45]

        // Similarly for peek functions too ...ie. viewing values from the deque
        System.out.println("adq.peek() = " + adq.peek());
        System.out.println("adq.peekFirst() = " + adq.peekFirst());
        System.out.println("adq.peekLast() = " + adq.peekLast());

        // Similarly for poll functions too ...ie. removing values from the deque
        System.out.println("adq = " + adq);

        System.out.println("adq.pollLast() = " + adq.pollLast());
        System.out.println("adq = " + adq);
        
        System.out.println("adq.poll() = " + adq.poll());
        System.out.println("adq = " + adq);
        
        System.out.println("adq.pollFirst() = " + adq.pollFirst());
        System.out.println("adq = " + adq);


    }
}
