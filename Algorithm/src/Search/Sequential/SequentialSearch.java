package Search.Sequential;

import LinkedList.SLL.SingleLinkList;

public class SequentialSearch<T> extends SingleLinkList<T>
{
    public Node search(T target)
    {
        Node current = head;
        Node match = null;

        while (current != null)
        {
            if(current.getData().equals(target))
            {
                match = current;
                break;
            }
            current = current.getNextNode();
        }

        return match;
    }

    public Node moveToFront(T target)
    {
        Node current = head;
        Node previous = null;
        Node match = null;

        while (current != null)
        {
            if(current.getData().equals(target))
            {
                match = current;
                if(previous != null)
                {
                    previous.setNextNode(current.getNextNode());
                    current.setNextNode(head);
                    head = current;
                }
                break;
            }
            previous = current;
            current = current.getNextNode();
        }
        return match;
    }

    public Node transpose(T target)
    {
        Node current = head;
        Node pprevious = null;
        Node previous = null;
        Node match = null;

        while (current != null)
        {
            if(current.getData().equals(target))
            {
                match = current;
                if(previous != null)
                {
                    if(pprevious != null) pprevious.setNextNode(current);
                    else head = current;
                    previous.setNextNode(current.getNextNode());
                    current.setNextNode(previous);
                }
                break;
            }
            if(previous != null)
                pprevious = previous;
            previous = current;
            current = current.getNextNode();
        }
        return match;
    }
}
