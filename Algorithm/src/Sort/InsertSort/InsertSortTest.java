package Sort.InsertSort;

import java.util.Arrays;

public class InsertSortTest {
    public static void main(String[] args) {
        int[] dataSet = new int[]{6, 4, 2, 3, 1, 5};

        InsertSort sort = new InsertSort(dataSet);

        System.out.println(Arrays.toString(sort.sort()));
    }
}
