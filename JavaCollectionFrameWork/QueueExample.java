import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Using LinkedList as Queue
        Queue<String> linkedQueue = new LinkedList<>();
        linkedQueue.add("First");
        linkedQueue.add("Second");
        linkedQueue.add("Third");
        System.out.println("LinkedList as Queue: " + linkedQueue);
        System.out.println("Poll (remove head): " + linkedQueue.poll());
        System.out.println("After poll: " + linkedQueue);

        // Using PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Poll (remove head): " + priorityQueue.poll());
        System.out.println("After poll: " + priorityQueue);
    }
}
