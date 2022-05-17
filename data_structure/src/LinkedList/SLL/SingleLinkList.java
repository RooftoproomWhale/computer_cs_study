package LinkedList.SLL;

public class SingleLinkList
{
    private Node head;
    private Node tail;


    public Node SLL_CreateNode(Object newData)
    {
        Node newNode = new Node(newData);
        newNode.nextNode = null;

        return newNode;
    }
    public void SLL_AppendNode(Node newNode)
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
       }
    }

    public void SLL_InsertAfter(Node current, Node newNode)
    {
        newNode.nextNode = current.nextNode;
        current.nextNode = newNode;
    }

    public void SLL_InsertNewHead(Node newHead)
    {
        if(head != null)
        {
            newHead.nextNode = head;
        }
        head = newHead;
    }

    public void SLL_RemoveNode(Node remove)
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

    public Node SLL_GetNodeAt(int location)
    {
        Node current = head;

        while(current != null && (--location) >= 0)
        {
            current = current.nextNode;
        }

        return current;
    }

    public int SLL_GetNodeCount()
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
