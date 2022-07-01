package Sort.QuickSort;

import Sort.Sort;

public class QuickSort extends Sort {
    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        quickSort(0 , array.length - 1);
        return array;
    }

    private int partition(int left, int right)
    {
        int first = left;
        int pivot = array[first];
        ++left;

        while(left <= right)
        {
            while (left <= right && array[left] <= pivot) ++left;
            while (left <= right && array[right] > pivot) --right;
            if (left <= right)
                swap(left,right);

        }
        swap(first,right);

        return right;
    }
    private void quickSort(int left, int right)
    {
        if(left < right)
        {
            int index = partition(left, right);

            quickSort(left, index - 1);
            quickSort(index + 1, right);
        }
    }
}
