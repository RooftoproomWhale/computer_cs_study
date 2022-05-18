package LinkedList.DLL;

import LinkedList.DLL.Node;

public class DoubleLinkList
{
    private Node head;
    private Node tail;


    public Node DLL_CreateNode(Object newData)
    {
        Node newNode = new Node(newData);
        newNode.prevNode = null;
        newNode.nextNode = null;

        return newNode;
    }
    public void DLL_AppendNode(Node newNode)
    {
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            tail = head;
            while(tail.nextNode != null)
            {
                tail = tail.nextNode;
            }
            tail.nextNode = newNode;
            newNode.prevNode = tail;
        }
    }

    public void DLL_InsertAfter(Node current, Node newNode)
    {
        newNode.nextNode = current.nextNode;
        newNode.prevNode = current;

        if(current.nextNode != null) current.nextNode.prevNode = newNode;
        current.nextNode = newNode;
    }

    public void DLL_RemoveNode(Node remove)
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

    public Node DLL_GetNodeAt(int location)
    {
        Node current = head;

        while(current != null && (--location) >= 0)
        {
            current = current.nextNode;
        }

        return current;
    }

    public int DLL_GetNodeCount()
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
