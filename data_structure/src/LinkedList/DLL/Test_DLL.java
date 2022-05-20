package LinkedList.DLL;

public class Test_DLL
{
    public static void main(String[] args)
    {
        int count = 0;

        DoubleLinkList<Integer> doubleLinkList = new DoubleLinkList<>();
        for (int i = 0; i < 5; i++)
        {
            doubleLinkList.AppendNode(i);
        }
        count = doubleLinkList.GetNodeCount();
        for (int i = 0; i < count; i++)
        {
            System.out.printf("List[%d] : %d\n",i,doubleLinkList.GetNodeAt(i).getData());
        }

        System.out.println("\nInserting 3000 After [2]...\n");


        doubleLinkList.InsertAfter(doubleLinkList.GetNodeAt(2),3000);
        doubleLinkList.RemoveNode(doubleLinkList.GetNodeAt(4));

        count = doubleLinkList.GetNodeCount();
        for (int i = 0; i < count; i++)
        {
            System.out.printf("List[%d] : %d\n",i,doubleLinkList.GetNodeAt(i).getData());
        }
    }
}
