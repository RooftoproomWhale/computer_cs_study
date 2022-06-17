package Tree.BinaryTree;

public class SBTNode<T>
{
    private SBTNode<T> Left;
    private SBTNode<T> Right;
    private final T data;

    public SBTNode(T data)
    {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public SBTNode<T> getLeft() {
        return Left;
    }

    public void setLeft(SBTNode<T> left) {
        Left = left;
    }

    public SBTNode<T> getRight() {
        return Right;
    }

    public void setRight(SBTNode<T> right) {
        Right = right;
    }
}
