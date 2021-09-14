package core.apple.arrays.leetcode.easy;

public class MaximumSumSubArray {


    public static void main(String[] args) {
        int[] nums =  {-2,1,-3,4,-1,2,1,-5,4};
        maximumSumSubArray_bt(nums);
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

    public static int maximumSumSubArray(int[] num){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = num[0];
        for(int i = 1; i <  num.length; i++){
            currentSum = Math.max(currentSum, currentSum+num[i]);
            maxSum = Math.max(currentSum, maxSum);

        }
        System.out.println(maxSum);
        return maxSum;
    }

}
