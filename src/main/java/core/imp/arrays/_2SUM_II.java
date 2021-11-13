package core.imp.arrays;

public class _2SUM_II {

    /*
        Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
        find two numbers such that they add up to a specific target number.
        Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

        We can apply Two Sum's solutions directly to get O(n^2)O(n2) time,
        O(1)O(1) space using brute force and O(n)O(n) time, O(n)O(n) space using hash table.
        However, both existing solutions do not make use of the property that the input array is sorted. We can do better.

        Example 1:
        Input: numbers = [2,7,11,15], target = 9
        Output: [1,2]
        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

        Example 2:
        Input: numbers = [2,3,4], target = 6
        Output: [1,3]
        Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

        Example 3:
        Input: numbers = [-1,0], target = -1
        Output: [1,2]
        Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].

     */

    public static int[] _2sum_II(int[] arr, int target){
        int l = 0;
        int r = arr.length -1 ;
        while(l < r){
            int sum = arr[l] + arr[r];
            if(sum == target){
                System.out.println(l);
                System.out.println(r);
                return new int[]{l, r};

            }
            else if(sum < target)
                l++;
            else
                r--;

        }
       return null;
    }

    public static void main(String[] args) {

        _2sum_II(new int[]{-1,0}, -1);

    }
}
