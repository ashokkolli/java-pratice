package core.windowsliding;

/**
 * Created by Ashok Kolli on 7/26/2020
 */

public class MaxSumOfKElements_BF {
    public static int getMaxSumOfKElements(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int max_sum = Integer.MIN_VALUE;

        if (arr.length == 0 || arr.length < k)
            return -1;
        for (int i = 0; i < arr.length - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++) {
                current_sum = current_sum + arr[i + j];
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(getMaxSumOfKElements(arr, k));
    }
}
