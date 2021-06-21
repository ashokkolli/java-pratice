package apple.arrays;

import java.util.*;

public class SubArraysSumK {
    public static void main(String[] args)
    {

        int[] arr = { 3, 4, 7, 2, -3,  1, 4, 2 };
        int sum = 7;
        int n = arr.length;
        System.out.println(findSubarraySum(arr, n, sum));
    }
    static int findSubarraySum(int[] arr, int n, int sum)
    {
        // HashMap to store number of subarrays
        // starting from index zero having
        // particular value of sum.
        Map<Integer, Integer> prevSum = new HashMap<>();

        int res = 0;

        // Sum of elements so far.
        int currsum = 0;

        for (int i = 0; i < n; i++) {

            // Add current element to sum so far.
            currsum += arr[i];

            // If currsum is equal to desired sum,
            // then a new subarray is found. So
            // increase count of subarrays.
            if (currsum == sum)
                res++;

            // currsum exceeds given sum by currsum
            //  - sum. Find number of subarrays having
            // this sum and exclude those subarrays
            // from currsum by increasing count by
            // same amount.
            if (prevSum.containsKey(currsum - sum))
                res += prevSum.get(currsum - sum);

            // Add currsum value to count of
            // different values of sum.
                prevSum.put(currsum, prevSum.getOrDefault(currsum, 0) + 1);
        }

        return res;
    }




    public static void bruteForce(){
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        List<List<Integer>> lists = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int  sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum  + arr[j];

                if (sum == k) {
                    count++;
                    break;
                }
            }
        }
    }


}
