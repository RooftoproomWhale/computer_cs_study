package LinkedList.SLL;

import LinkedList.LinkedList;

public class SingleLinkList<T> implements LinkedList<T>
{
    public class Node {
        T data;
        Node nextNode;
        public Node(T newData)
        {
            this.data = newData;
            this.nextNode = null;
        }

        public T getData() {
            return data;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getNextNode() {
            return nextNode;
        }
    }
    public Node head;
    private Node tail;

    public void AppendNode(T newNode)
    {
       if(head == null)
       {
           head = new Node(newNode);
       }
       else
       {
           tail = head;
           while(tail.nextNode != null)
           {
               tail = tail.nextNode;
           }
           tail.nextNode = new Node(newNode);
       }
    }

    public void InsertAfter(Node current, T newData)
    {
        Node newNode = new Node(newData);
        newNode.nextNode = current.nextNode;
        current.nextNode = newNode;
    }

    public void InsertNewHead(T data)
    {
        Node newHead = new Node(data);
        if(head != null)
        {
            newHead.nextNode = head;
        }
        head = newHead;
    }

    public void RemoveNode(Node remove)
    {
        if(head == remove)
        {
            head = remove.nextNode;
        }
        else
        {
            Node current = head;
            while(current != null && current.nextNode != remove)
            {
                current = current.nextNode;
            }

            if (current != null)
                current.nextNode = remove.nextNode;
        }
    }

    public Node GetNodeAt(int location)
    {
        Node current = head;

        while(current != null && (--location) >= 0)
        {
            current = current.nextNode;
        }

        return current;
    }

    public int GetNodeCount()
    {
        int count = 0;
        Node current = head;

        while(current != null)
        {
            current = current.nextNode;
            count++;
        }
        return count;
    }
}
