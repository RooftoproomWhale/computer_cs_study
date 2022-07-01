package Sort.BubbleSort;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] dataSet = new int[]{6, 4, 2, 3, 1, 5};
        /*int[] dataSet = new int[100000];
        for(int i=0; i<100000; i++) {
            dataSet[i] = (int) Math.random();
        }*/

        BubbleSort sort = new BubbleSort(dataSet);

        System.out.println(Arrays.toString(sort.sort()));
    }
}
