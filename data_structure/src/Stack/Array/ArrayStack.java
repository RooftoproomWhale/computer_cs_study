package Stack.Array;

public class ArrayStack<T>
{
    private final int capacity;
    private int top;
    private final Object[] data;

    public ArrayStack(int capacity)
    {
        this.capacity = capacity;
        this.top = 0;
        this.data = new Object[capacity];
    }

    public void push(T data)
    {
        this.data[top] = data;
        top++;
    }

    public Object pop()
    {
        data[top] = null;
        return data[--top];
    }

    public Object top()
    {
        return data[top-1];
    }

    public int getSize()
    {
        return top;
    }

    public boolean isEmpty()
    {
        return (top == 0);
    }

    public int getCapacity() {
        return capacity;
    }
}
