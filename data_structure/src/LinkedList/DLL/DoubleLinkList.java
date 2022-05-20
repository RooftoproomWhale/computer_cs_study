package LinkedList.DLL;

import LinkedList.LinkedList;

public class DoubleLinkList<T> implements LinkedList<T>
{
    public class Node {
        T data;
        Node prevNode;
        Node nextNode;
        public Node(T newData)
        {
            this.data = newData;
            this.prevNode = null;
            this.nextNode = null;
        }

        public T getData() {
            return data;
        }

        public Node getPrevNode() {
            return prevNode;
        }

        public Node getNextNode() {
            return nextNode;
        }
    }
    private Node head;
    private Node tail;


    public Node CreateNode(T newData)
    {
        return new Node(newData);
    }
    public void AppendNode(T newData)
    {
        if(head == null)
        {
            head = new Node(newData);
        }
        else
        {
            tail = head;
            while(tail.nextNode != null)
            {
                tail = tail.nextNode;
            }
            Node newNode = new Node(newData);
            tail.nextNode = newNode;
            newNode.prevNode = tail;
        }
    }

    @Override
    public void InsertNewHead(T newNode) {

    }

    public void InsertAfter(Node current, T newData)
    {
        Node newNode = new Node(newData);
        newNode.nextNode = current.nextNode;
        newNode.prevNode = current;

        if(current.nextNode != null) current.nextNode.prevNode = newNode;
        current.nextNode = newNode;
    }

    public void RemoveNode(Node remove)
    {
        if(head == remove)
        {
            head = remove.nextNode;
            if(head != null) head.prevNode = null;
            remove.prevNode = null;
            remove.nextNode = null;
        }
        else
        {
            Node temp = remove;

            remove.prevNode.nextNode = temp.nextNode;
            if(remove.nextNode != null) remove.nextNode.prevNode = temp.prevNode;

            remove.prevNode = null;
            remove.nextNode = null;
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
