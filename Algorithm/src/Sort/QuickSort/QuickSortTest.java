package Sort.QuickSort;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] dataSet = new int[]{6, 4, 2, 3, 1, 5};
//        int[] dataSet = new int[]{1, 4, 3, 2, 5, 6, 8, 7, 9};

        QuickSort sort = new QuickSort(dataSet);

        System.out.println(Arrays.toString(sort.sort()));
    }
}
