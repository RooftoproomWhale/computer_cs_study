package Search.Binary;

public class BSTNode<T extends Comparable<T>> implements Comparable<T>
{
    private BSTNode<T> left;
    private BSTNode<T> right;
    private T data;

    public BSTNode(T data) {
        this.data = data;
    }

    public boolean isEquals(T data)
    {
        return this.data.equals(data);
    }

    public boolean isLessThan(T data)
    {
        return this.data.compareTo(data) < 0;
    }

    public boolean isMoreThan(T data)
    {
        return this.data.compareTo(data) > 0;
    }

    public BSTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public BSTNode<T> getRight() {
        return right;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public int compareTo(T o) {
        return this.data.compareTo(o);
    }
}
