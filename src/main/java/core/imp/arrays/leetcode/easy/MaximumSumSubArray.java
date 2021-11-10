package core.imp.arrays.leetcode.easy;

public class MaximumSumSubArray {


    public static void main(String[] args) {
        int[] nums =  {-2,1,-3,4,-1,2,1,-5,4};
        maximumSumSubArray(nums);
    }

    public static int maximumSumSubArray_bt(int[] num){
        int maximumSum = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++){
            int currentSum = 0;
            for(int j = i ; j < num.length; j++){
                currentSum = currentSum + num[j];
                maximumSum = Math.max(currentSum, maximumSum);
            }
        }
        System.out.println(maximumSum);
        return maximumSum;
    }



    /*
    * https://leetcode.com/problems/maximum-subarray/solution/
    *
    * Dynamic Programming, Kadane's Algorithm
    *
    * 1. Initialize 2 integer variables. Set both of them equal to the first value in the array.
    * 2. currentSubarray will keep the running count of the current subarray we are focusing on.
    * maxSubarray will be our final return value. Continuously update it whenever we find a bigger subarray.
    * Iterate through the array, starting with the 2nd element (as we used the first element to initialize our variables).
    * For each number, add it to the currentSubarray we are building.
    * If currentSubarray becomes negative, we know it isn't worth keeping, so throw it away.
    * Remember to update maxSubarray every time we find a new maximum.
    3. Return maxSubarray.
    * */
    public static int maximumSumSubArray(int[] num){
        int max_sum = num[0];
        int curr_sum = num[0];
        for(int i = 1; i <  num.length; i++){
            curr_sum = Math.max(num[i], curr_sum+num[i]);
            max_sum = Math.max(curr_sum, max_sum);

        }
        System.out.println(max_sum);
        return max_sum;
    }

    //Practice
    public static int maximumSumSubArray_pr(int[] num){
        int max_sum = num[0];
        int curr_sum = num[0];
//        int[] nums =  {-2,1,-3,4,-1,2,1,-5,4};
        for(int i =1; i < num.length; i++){
               curr_sum = Math.max(num[i], curr_sum + num[i]);
               max_sum = Math.max(max_sum, curr_sum);
            }
        System.out.println(max_sum);
        return max_sum;
    }
}
