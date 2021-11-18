package core.imp.windowsliding;

/**
 * Created by Ashok Kolli on 7/26/2020
 */

public class MaxSubArrayOfKElements {
    public static int getMaxSubArrayOfKElements(int[] arr, int k) {
        int wSum = 0;
        int mSum = 0;
        if (arr.length == 0)
            return -1;
        if (arr.length == 1 && k == 1)
            return arr[0];
        if (arr.length < k)
            return -1;
        for (int i = 0; i < k; i++) {
            wSum += arr[i];
        }
        for (int end = k; end < arr.length; end++) {
            wSum += arr[end] - arr[end - k];
            mSum = Math.max(mSum, wSum);
        }
        return mSum;

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(getMaxSubArrayOfKElements(arr, k));
    }
}
