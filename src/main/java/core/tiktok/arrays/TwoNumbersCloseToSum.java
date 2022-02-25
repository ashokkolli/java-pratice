package core.tiktok.arrays;
import java.util.*;
import java.lang.*;
/**
 * Created by Ashok Kolli on 5/5/2021
 */

public class TwoNumbersCloseToSum {

    /*
        Return the difference between the sum of the two integers and the target.
        Example: Given array nums = [-1, 2, 1, -4], and target = 4.
        The minimum difference is 1. (4 - (2 + 1) = 1).
        Do it in O(nlogn) time complexity.
    */
    
        static int minAbsSumPair(int[] nums, int target)
        {

            if (nums == null || nums.length == 0) {
                return 0;
            }

            Arrays.sort(nums);
            int low = 0, high = nums.length - 1;
            int diff = Integer.MAX_VALUE;

            while (low < high) {
                int sum = nums[low] + nums[high];

                if (sum > target) {
                    high--;
                } else {
                    low++;
                }

                diff = Math.min(diff, Math.abs(sum - target));
            }

            return diff;
        }

        // main function
        public static void main (String[] args)
        {
            int arr[] = {1, 60, -10, 70, -80, 85};
            int target = 4;
            minAbsSumPair(arr, target);
        }


        /* The main function that implements QuickSort()
          arr[] --> Array to be sorted,
          low  --> Starting index,
          high  --> Ending index */

    }

