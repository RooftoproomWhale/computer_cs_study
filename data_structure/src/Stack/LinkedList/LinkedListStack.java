package Stack.LinkedList;

public class LinkedListStack<T>
{
    public class Node
    {
        private T data;
        private Node nextNode;

        public Node(T data) {
            this.data = data;
            this.nextNode = null;
        }

        public T getData() {
            return data;
        }
    }

    private Node List;
    private Node Top;

    public void push(T newData)
    {
        Node newNode = new Node(newData);
        if(List == null)
        {
            List = newNode;
        }
        else
        {
            Node oldTop = List;
            while(oldTop.nextNode != null)
            {
                oldTop = oldTop.nextNode;
            }
            oldTop.nextNode = newNode;
        }
        Top = newNode;
    }

    public Node pop()
    {
        Node TopNode = Top;
        if (List == Top)
        {
            List = null;
            Top = null;
        }
        else
        {
            Node currentTop = List;
            while(currentTop != null && currentTop.nextNode != Top)
            {
                currentTop = currentTop.nextNode;
            }
            Top = currentTop;
            currentTop.nextNode = null;
        }
        return TopNode;
    }

    public Node top()
    {
        return Top;
    }

    public int getSize()
    {
        int count = 0;
        Node current = List;

        while(current != null)
        {
            current = current.nextNode;
            count++;
        }

        return count;
    }

    public boolean isEmpty()
    {
        return (List == null);
    }
}
