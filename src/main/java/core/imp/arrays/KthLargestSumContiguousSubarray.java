//Given an core.array of integers. Write a program to find the K-th largest sum of contiguous subarray within the core.array of numbers which has negative
//and positive numbers

package core.imp.arrays;

public class KthLargestSumContiguousSubarray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {20, -5, -1};
        //20; 20-5; 20-5-1; -
        findKthLargestSum(arr, arr.length);
    }


    public static void findKthLargestSum(int[] arr, int len) {

        if (len == 0)
            return;
        int[] sumArr = new int[10];
        int sum = 0;
        int k = 0;
        int i;
        for (i = 0; i < len; i++) {

            sum = 0;

            //System.out.println("i is : "+ i);
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    sumArr[k] = arr[i];
                    k++;
                } else
                    sum = sum + arr[j];
                //count=count+1;
            }
            //System.out.println(sum);
            //if (count>1)
            //{
            sumArr[k] = sum;

            k++;
            //}
            //count=0;
        }

        for (int l : sumArr)
            System.out.println(l);
    }

}
