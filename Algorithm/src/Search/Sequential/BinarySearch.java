package Search.Sequential;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch
{
    static class Score
    {
        private final int number;
        private final int score;

        public Score(int number, int score) {
            this.number = number;
            this.score = score;
        }

        public int getNumber() {
            return number;
        }

        public double getScore() {
            return score;
        }

        @Override
        public String toString() {
            return String.format("%d번째 요소 점수 : %d",number,score);
        }
    }
    private static Score search(Score[] array, int target)
    {
        int left, right, mid;
        left = 0;
        right = array.length - 1;

        while(left <= right)
        {
            mid = (left + right) / 2;
            if(array[mid].getScore() == target) return array[mid];
            else if (target > array[mid].getScore()) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
    public static void main(String[] args)
    {
        Score[] dataSet = new Score[8];
        int[] score = new int[]{877, 176, 365, 162, 148, 89, 342, 811};

        for (int i = 0; i < dataSet.length; i++)
        {
            dataSet[i] = new Score(i + 1, score[i]);
        }
        Arrays.sort(dataSet, new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                return o1.score - o2.score;
            }
        });
        System.out.println(search(dataSet, 89));
    }
}
