package LinkedList.CDLL;

import LinkedList.DLL.Node;

public class CircularDoublyLinkedList
{
    private Node head;
    private Node tail;

    public Node CDLL_CreateNode(Object newData)
    {
        return new Node(newData);
    }

    public void CDLL_AppendNode(Node newNode)
    {
        if(head == null)
        {
            head = newNode;
            head.prevNode = head;
            head.nextNode = head;
        }
        else
        {
            tail = head.prevNode;

            tail.nextNode.prevNode = newNode;
            tail.nextNode = newNode;

            newNode.nextNode = head;
            newNode.prevNode = tail;
        }
    }

    public void CDLL_InsertAfter(Node current, Node NewNode)
    {
        NewNode.nextNode = current.nextNode;
        NewNode.prevNode = current;

        current.nextNode.prevNode = NewNode;
        current.nextNode = NewNode;
    }

    public void CDLL_RemoveNode(Node remove)
    {
        if(head == remove)
        {
            head.prevNode.nextNode = remove.nextNode;
            head.nextNode.prevNode = remove.prevNode;

            head = remove.nextNode;

            remove.prevNode = null;
            remove.nextNode = null;
        }
        else
        {
            Node temp = remove;

            remove.prevNode.nextNode = temp.nextNode;
            remove.nextNode.prevNode = temp.prevNode;

            remove.prevNode = null;
            remove.nextNode = null;
        }
    }

    public Node CDLL_GetNodeAt(int location)
    {
        Node current = head;

        while(current != null && (--location) >= 0)
        {
            current = current.nextNode;
        }

        return current;
    }

    public int CDLL_GetNodeCount()
    {
        int count = 0;
        Node current = head;

        while(current != null)
        {
            current = current.nextNode;
            count++;

            if(current == head) break;
        }
        return count;
    }

    public void PrintNode(Node node)
    {
        if(node.prevNode == null)
            System.out.println("Prev: NULL");
        else
            System.out.println("Prev: " + node.prevNode.data);

        System.out.println("Current: " + node.data);

        if(node.nextNode == null)
            System.out.println("Next: NULL");
        else
            System.out.println("Next: " + node.nextNode.data);
    }
}
