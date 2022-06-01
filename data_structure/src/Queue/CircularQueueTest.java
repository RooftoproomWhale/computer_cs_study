package Queue;

public class CircularQueueTest
{
    public static void main(String[] args)
    {
        CircularQueue<Integer> queue = new CircularQueue<>(10);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        for (int i = 0; i < 3; i++)
        {
            System.out.print("Dequeue: " + queue.dequeue());
            System.out.println(" Front: " + queue.getFront() + ", Rear: " + queue.getRear());
        }

        int data = 100;
        while (!queue.isFull())
        {
            queue.enqueue(data++);
        }
        System.out.println("Capacity: " + queue.getCapacity() + ", Size: " + queue.getSize());

        while (!queue.isEmpty())
        {
            System.out.print("Dequeue: " + queue.dequeue());
            System.out.println(" Front: " + queue.getFront() + ", Rear: " + queue.getRear());
        }
    }
}
