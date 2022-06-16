package Tree;

public class LCRSNode<T>
{
    private LCRSNode<T> LeftChild;
    private LCRSNode<T> RightSibling;
    private final T Data;

    public LCRSNode(T data) {
        Data = data;
    }

    public T getData() {
        return Data;
    }

    public LCRSNode<T> getLeftChild() {
        return LeftChild;
    }

    public LCRSNode<T> getRightSibling() {
        return RightSibling;
    }

    public void setLeftChild(LCRSNode<T> leftChild) {
        LeftChild = leftChild;
    }

    public void setRightSibling(LCRSNode<T> rightSibling) {
        RightSibling = rightSibling;
    }
}
