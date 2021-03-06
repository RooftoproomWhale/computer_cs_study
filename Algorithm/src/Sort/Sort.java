package Sort;

public abstract class Sort
{
    protected final int[] array;

    public Sort(int[] array) {
        this.array = array;
    }

    public abstract int[] sort();

    public final void swap(int to, int from) {
        int swap = array[to];
        array[to] = array[from];
        array[from] = swap;
    }
}
