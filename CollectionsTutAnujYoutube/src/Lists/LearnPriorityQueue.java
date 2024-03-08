package Lists;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        // Priority queue implements min heap internally (min heap by default but we can change the ordering)
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println("pq = " + pq);

        System.out.println("pq.poll() = " + pq.poll()); // highest priority element will come out ie. smallest element

        System.out.println("pq.poll() = " + pq.poll());

        System.out.println("pq = " + pq);

        System.out.println("pq.peek() = " + pq.peek());


        // MAX HEAP

        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.offer(40);
        pq1.offer(12);
        pq1.offer(24);
        pq1.offer(36);

        System.out.println("MAx heap -> pq1 = " + pq1);

        System.out.println("pq1.poll() = " + pq1.poll()); // highest priority element will come out ie. smallest element

        System.out.println("pq1.poll() = " + pq1.poll());

        System.out.println("pq1 = " + pq1);

        System.out.println("pq1.peek() = " + pq1.peek());
    }
}
