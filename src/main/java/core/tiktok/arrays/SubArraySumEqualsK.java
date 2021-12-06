//https://www.geeksforgeeks.org/count-pairs-with-given-sum/
package core.tiktok.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SubArraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) // increase the count when Sum == k as with map, we only do sum-k;
                count++;
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    // Driver method to test the above function
    public static void main(String[] args) {

        int count = bf(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(count);

    }

    public static int bf(int[] nums, int k) {

        int count = 0;
        Arrays.sort(nums);
       for(int i = 0; i< nums.length; i++){
           int sum = 0;
           for(int j = i; j < nums.length; j++){
               sum = sum+nums[j];
               if(sum == k)
                   count ++;
           }
       }
        return count;
    }
}
