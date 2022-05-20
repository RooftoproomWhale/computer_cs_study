package LinkedList.SLL;

public class Test_SLL
{
    public static void main(String[] args)
    {
        int count = 0;

        SingleLinkList<Integer> singleLinkList = new SingleLinkList<>();
        for (int i = 0; i < 5; i++)
        {
            singleLinkList.AppendNode(i);
        }

        singleLinkList.InsertNewHead(-1);
        singleLinkList.InsertNewHead(-2);

        count = singleLinkList.GetNodeCount();
        for (int i = 0; i < count; i++)
        {
            System.out.printf("List[%d] : %d\n",i,singleLinkList.GetNodeAt(i).getData());
        }

        System.out.println("\nInserting 3000 After [2]...\n");

        singleLinkList.InsertAfter(singleLinkList.GetNodeAt(2),3000);
        singleLinkList.RemoveNode(singleLinkList.GetNodeAt(6));
        count = singleLinkList.GetNodeCount();
        for (int i = 0; i < count; i++)
        {
            System.out.printf("List[%d] : %d\n",i,singleLinkList.GetNodeAt(i).getData());
        }
    }
}
