package LinkedList.DLL;

import LinkedList.DLL.Node;
import LinkedList.DLL.DoubleLinkList;

public class Test_DLL
{
    public static void main(String[] args)
    {
        int count = 0;
        Node current = null;
        Node newNode = null;

        DoubleLinkList doubleLinkList = new DoubleLinkList();
        for (int i = 0; i < 5; i++)
        {
            doubleLinkList.DLL_AppendNode(doubleLinkList.DLL_CreateNode(i));
        }
        count = doubleLinkList.DLL_GetNodeCount();
        for (int i = 0; i < count; i++)
        {
            current = doubleLinkList.DLL_GetNodeAt(i);
            System.out.printf("List[%d] : %d\n",i,(int)current.data);
        }

        System.out.println("\nInserting 3000 After [2]...\n");

        current = doubleLinkList.DLL_GetNodeAt(2);
        newNode = doubleLinkList.DLL_CreateNode(3000);
        doubleLinkList.DLL_InsertAfter(current,newNode);

        count = doubleLinkList.DLL_GetNodeCount();
        for (int i = 0; i < count; i++)
        {
            current = doubleLinkList.DLL_GetNodeAt(i);
            System.out.printf("List[%d] : %d\n",i,(int)current.data);
        }
    }
}
