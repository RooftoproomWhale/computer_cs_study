package Sort.BubbleSort;

import Sort.Sort;

public class BubbleSort extends Sort
{
    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        before = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - (i + 1); j++)
            {
                if(array[j] > array[j + 1])
                {
                    swap(j + 1, j);
                }
            }
        }
        after = System.currentTimeMillis();
        return array;
    }
}
