package Queue.Circular;

public class CircularQueue<T>
{
    private final int Capacity;
    private int front;
    private int rear;
    private final Object[] data;

    public CircularQueue(int capacity) {
        this.Capacity = capacity;
        this.data = new Object[this.Capacity + 1];
    }

    public int getCapacity() {
        return Capacity;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public void enqueue(T newData)
    {
        int position = 0;

        if(rear == Capacity)
        {
            position = rear;
            rear = 0;
        }
        else position = rear++;

        data[position] = newData;
    }

    public Object dequeue()
    {
        int position = front;
        if(front == Capacity) front = 0;
        else front++;

        Object returnValue = data[position];
        data[position] = null;
        return returnValue;
    }

    public int getSize()
    {
        return (front <= rear) ? rear - front : rear + (Capacity - front) + 1 ;
    }

    public boolean isEmpty()
    {
        return front == rear;
    }

    public boolean isFull()
    {
        return (front < rear) ? (rear - front) == Capacity : (rear + 1) == front;
    }
}
