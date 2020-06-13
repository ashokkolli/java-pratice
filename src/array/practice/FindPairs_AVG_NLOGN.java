package array.practice;

import java.util.Arrays;

public class FindPairs_AVG_NLOGN {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        int len = arr.length;
        //Test
        //1. Check if the array is sorted or not
        // 2.check if array length is zero or 1 element
        //2. Check if all the array chars are digits
        //3. Ask, if they want us to return the just the number of pair or pairs as well.
        //4. What should be the expecting return type.
        //5. what could be the max length of the array. What should be done in case of exceeding size.
        int pairCount = 0;
        findPairs(arr, len, sum);

    }

    public static int findPairs(int[] arr, int len, int sum) {
        int count = 0;
        int low = 0, high = len - 1;
        //if array length is 0 or 1, return -1
        if (len == 0 | len == 1)
            return -1;
        Arrays.sort(arr);
        //travers array, take 1st value and add it to all remaining values
        while (low < high) {
            if (arr[low] + arr[high] == sum)
                count++;
            if (arr[low] + arr[high] < sum)
                low++;
            else
                high--;
        }
        return count;
    }

}
