package amazon.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ashok Kolli on 5/6/2021
 */

public class CountTotalPairs2Sum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int sum = -2;
        countTotalPair2Sum(arr, sum);
    }

    public static void countTotalPair2Sum(int[] arr, int sum) {
        Set<HashSet<Integer>> setCollection = new HashSet<>();
        Set<Integer> sets = new HashSet<>();
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] + arr[r] > sum)
                r--;
            else if (arr[l] + arr[r] < sum)
                l++;
            else {
                System.out.println(arr[l] + " " + arr[r]);
                l++;
            }
        }
    }
}
