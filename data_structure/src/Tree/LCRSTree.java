package Tree;

public class LCRSTree<T>
{
    public void addChildNode(LCRSNode<T> parent, LCRSNode<T> child)
    {
        if (parent.getLeftChild() == null)
        {
            parent.setLeftChild(child);
        }
        else
        {
            LCRSNode<T> tempNode = parent.getLeftChild();
            while (tempNode.getRightSibling() != null) {
                tempNode = tempNode.getRightSibling();
            }
            tempNode.setRightSibling(child);
        }
    }

    public void printTree(LCRSNode<T> node, int depth)
    {
        for (int i = 0; i < depth; i++)
            System.out.print(" ");

        System.out.println(node.getData());

        if(node.getLeftChild() != null)
            printTree(node.getLeftChild(),depth + 1);

        if(node.getRightSibling() != null)
            printTree(node.getRightSibling(),depth);
    }

    public void printNodesAtLevel(LCRSNode<T> root, int level)
    {
        if (level == 0)
        {
            System.out.print(root.getData() + " ");
        }
        else if (level > 0)
        {
            if(root.getLeftChild() != null)
                printNodesAtLevel(root.getLeftChild(), level - 1);
        }
        if(root.getRightSibling() != null)
            printNodesAtLevel(root.getRightSibling(), level);
    }
}
