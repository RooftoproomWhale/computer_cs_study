package LinkedList.CDLL;

import LinkedList.DLL.Node;

public class Test_SDLL
{
    public static void main(String[] args)
    {
        int count = 0;
        Node current = null;
        Node newNode = null;

        CircularDoublyLinkedList CDLinkedList = new CircularDoublyLinkedList();
        for(int i = 0; i < 5; i++)
        {
            CDLinkedList.CDLL_AppendNode(CDLinkedList.CDLL_CreateNode(i));
        }

        count = CDLinkedList.CDLL_GetNodeCount();
        for(int i = 0; i < count; i++)
        {
            current = CDLinkedList.CDLL_GetNodeAt(i);
            System.out.printf("List[%d] : %d\n",i,(int)current.data);
        }

        System.out.println("\nInserting 3000 After [2]...\n");
        current = CDLinkedList.CDLL_GetNodeAt(2);
        newNode = CDLinkedList.CDLL_CreateNode(3000);
        CDLinkedList.CDLL_InsertAfter(current,newNode);

        count = CDLinkedList.CDLL_GetNodeCount();
        for(int i = 0; i < count*2; i++)
        {
            if(i == 0)
                current = CDLinkedList.CDLL_GetNodeAt(0);
            else
                current = current.nextNode;

            System.out.printf("List[%d] : %d\n",i,(int)current.data);
        }
    }
}
