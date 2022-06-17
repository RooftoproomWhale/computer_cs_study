package Tree.BinaryTree;

public class BinaryTree<T>
{
    public void preOrderPrintTree(SBTNode<T> node)
    {
        if (node == null) return;

        System.out.print(" " + node.getData());

        preOrderPrintTree(node.getLeft());

        preOrderPrintTree(node.getRight());
    }

    public void inOrderPrintTree(SBTNode<T> node)
    {
        if (node == null) return;

        inOrderPrintTree(node.getLeft());

        System.out.print(" " + node.getData());

        inOrderPrintTree(node.getRight());
    }

    public void postOrderPrintTree(SBTNode<T> node)
    {
        if (node == null) return;

        postOrderPrintTree(node.getLeft());

        postOrderPrintTree(node.getRight());

        System.out.print(" " + node.getData());
    }

    public void destroyTree(SBTNode<T> node)
    {
        if(node == null) return;

        destroyTree(node.getLeft());

        destroyTree(node.getRight());

        node = null;
    }
}
