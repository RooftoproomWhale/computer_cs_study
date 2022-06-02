package Queue.Linked;

public class LinkedQueue<T>
{
    class Node
    {
        private T data;
        private Node nextNode;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    private Node front;
    private Node rear;
    private int count;

    public void enqueue(T newData)
    {
        Node newNode = new Node(newData);
        if(front == null)
        {
            front = newNode;
            rear = newNode;
        }
        else
        {
            rear.nextNode = newNode;
            rear = rear.nextNode;
        }
        count++;
    }

    public Node dequeue()
    {
        Node frontNode = front;
        if(front.nextNode == null)
        {
            front = null;
            rear = null;
        }
        else
        {
            front = front.nextNode;
        }
        count--;

        return frontNode;
    }

    public boolean isEmpty()
    {
        return front == null;
    }
    public int getSize()
    {
        return count;
    }
}
