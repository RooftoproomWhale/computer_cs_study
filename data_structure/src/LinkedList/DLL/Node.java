package LinkedList.DLL;

public class Node {
    public Object data;
    public Node prevNode;
    public Node nextNode;
    public Node(Object newData)
    {
        this.data = newData;
        this.prevNode = null;
        this.nextNode = null;
    }
}
