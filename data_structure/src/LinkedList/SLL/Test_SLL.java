package LinkedList.SLL;

public class Test_SLL
{
    public static void main(String[] args)
    {
        int count = 0;
        Node current = null;
        Node newNode = null;

        SingleLinkList singleLinkList = new SingleLinkList();
        for (int i = 0; i < 5; i++)
        {
            singleLinkList.SLL_AppendNode(singleLinkList.SLL_CreateNode(i));
        }

        singleLinkList.SLL_InsertNewHead(singleLinkList.SLL_CreateNode(-1));
        singleLinkList.SLL_InsertNewHead(singleLinkList.SLL_CreateNode(-2));

        count = singleLinkList.SLL_GetNodeCount();
        for (int i = 0; i < count; i++)
        {
            current = singleLinkList.SLL_GetNodeAt(i);
            System.out.printf("List[%d] : %d\n",i,(int)current.data);
        }

        System.out.println("\nInserting 3000 After [2]...\n");

        current = singleLinkList.SLL_GetNodeAt(2);
        newNode = singleLinkList.SLL_CreateNode(3000);
        singleLinkList.SLL_InsertAfter(current,newNode);

        count = singleLinkList.SLL_GetNodeCount();
        for (int i = 0; i < count; i++)
        {
            current = singleLinkList.SLL_GetNodeAt(i);
            System.out.printf("List[%d] : %d\n",i,(int)current.data);
        }
    }
}
