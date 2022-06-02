package Queue.Linked;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();

        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("efg");
        queue.enqueue("hij");

        System.out.println("Queue Size : " + queue.getSize());

        while(!queue.isEmpty())
        {
             LinkedQueue<String>.Node popped = queue.dequeue();
             System.out.println("Dequeue : " + popped.getData());
        }
    }
}
