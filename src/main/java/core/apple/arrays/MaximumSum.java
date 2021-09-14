package core.apple.arrays;

public class MaximumSum {

    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
       // int[] arr = { 5, -1, 4, 7, 8};
        //int[] arr = { -1};
        int sum = maxSum_Kadenes_algo(arr);
        System.out.println(sum);
    }

    public static int maxSum_BT(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int currentSubArraySum = 0;
            for(int j = i ; j < arr.length ; j++){
                currentSubArraySum += arr[j];
                maxSum = Math.max(maxSum, currentSubArraySum);
            }
        }
        return maxSum;
    }

    public static int maxSum_Kadenes_algo(int[] arr){
        //initialize variables with first element
        int currentSumSubArr = arr[0];
        int maxSumSubArr = arr[0];
        //int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        //Start with the 2nd element since we already used first element
        for(int i = 1; i < arr.length; i++){
            int num = arr[i];
            //if current Sub core.array is negative, throw it away, otherwise keep adding it.
            currentSumSubArr = Math.max(num, currentSumSubArr + num);
            maxSumSubArr  =  Math.max(maxSumSubArr, currentSumSubArr );
        }

        return maxSumSubArr;
    }
}
