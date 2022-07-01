package Sort.InsertSort;

import Sort.Sort;

public class InsertSort extends Sort {
    public InsertSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        for(int i = 1; i < array.length; i++)
        {
            if(array[i - 1] <= array[i])
                continue;

            int target = array[i];
            int j = i;

            while (j > 0 && array[j - 1] > target)
            {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = target;

        }
        return array;
    }
}
