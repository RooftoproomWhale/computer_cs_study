package LinkedList.DLL;

public class Node {
    Object data;
    Node prevNode;
    Node nextNode;
    public Node(Object newData)
    {
        this.data = newData;
        this.prevNode = null;
        this.nextNode = null;
    }
}
