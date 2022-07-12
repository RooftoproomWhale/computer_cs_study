package Search.Binary;

public class BinarySearchTree<T extends Comparable<T>>
{
    private final BSTNode<T> root;

    public BinarySearchTree(BSTNode<T> root) {
        this.root = root;
    }

    public BSTNode<T> searchNode(BSTNode<T> node, T target)
    {
        BSTNode<T> returnNode = null;

        if(node == null) return null;

        if(node.isEquals(target)) returnNode = node;
        else if(node.isLessThan(target)) searchNode(node.getLeft(), target);
        else searchNode(node.getRight(), target);

        return returnNode;
    }

    public BSTNode<T> searchMinNode(BSTNode<T> node)
    {
        if(node == null) return null;

        return (node.getLeft() == null) ? node : searchMinNode(node.getLeft());
    }

    public void insertNode(BSTNode<T> node, BSTNode<T> child)
    {
        if(node.isLessThan(child.getData()))
        {
            if(node.getRight() == null) node.setRight(child);
            else insertNode(node.getRight(), child);
        }
        else if (child.isLessThan(node.getData()))
        {
            if(node.getLeft() == null) node.setLeft(child);
            else insertNode(node.getLeft(), child);
        }
    }

    public BSTNode<T> removeNode(BSTNode<T> node, BSTNode<T> parent, T target)
    {
        BSTNode<T> removed = null;

        if(node == null) return null;

        if(node.isMoreThan(target)) removed = removeNode(node.getLeft(), node, target);
        else if(node.isLessThan(target)) removed = removeNode(node.getRight(), node, target);
        else
        {
            removed = node;

            if( node.getLeft() == null && node.getRight() == null)
            {
                if(parent.getLeft() == node) node.setLeft(null);
                else node.setRight(null);
            }
            else
            {
                BSTNode<T> temp = (node.getLeft() != null) ? node.getLeft() : node.getRight();
                if(parent.getLeft() == node) parent.setLeft(temp);
                else parent.setRight(temp);
            }
        }

        return removed;
    }

    public void inorderPrintTree(BSTNode<T> node)
    {
        if(node == null) return;

        inorderPrintTree(node.getLeft());
        System.out.print(node.getData() + " ");
        inorderPrintTree(node.getRight());
    }

    public BSTNode<T> getRoot() {
        return root;
    }
}
