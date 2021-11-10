package core.imp.arrays;

import java.util.*;

public class SubArraysSumK {
    public static void main(String[] args)
    {

        int[] arr = { 3, 4, 7, 2, -3,  1, 4, 2 };
        int sum = 7;
        int n = arr.length;
        System.out.println(findSubArraySum(arr, n, sum));
    }
    static int findSubArraySum(int[] arr, int n, int sum)
    {
        // HashMap to store number of sub Arrays
        // starting from index zero having
        // particular value of sum.
        Map<Integer, Integer> prevSum = new HashMap<>();
        int res = 0;
        // Sum of elements so far.
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            // Add current element to sum so far.
            currSum += arr[i];
            // If currSum is equal to desired sum,
            // then a new sub core.array is found. So
            // increase count of sub arrays.
            if (currSum == sum)
                res++;
            // currSum exceeds given sum by currSum
            //  - sum. Find number of sub arrays having
            // this sum and exclude those sub arrays
            // from currSum by increasing count by
            // same amount.
            if (prevSum.containsKey(currSum - sum))
                res += prevSum.get(currSum - sum);
            // Add currSum value to count of
            // different values of sum.
                prevSum.put(currSum, prevSum.getOrDefault(currSum, 0) + 1);
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
