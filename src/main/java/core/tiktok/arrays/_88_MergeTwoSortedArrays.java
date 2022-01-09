package core.tiktok.arrays;

/**
 * Created by Ashok Kolli on 4/27/2021
 */

public class _88_MergeTwoSortedArrays {


    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 6};
        int[] num2 = {2, 5, 8};
        int m = nums1.length;
        int n = num2.length;

        int[] outputArr = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < num2[j])
                outputArr[k++] = nums1[i++];
            else
                outputArr[k++] = num2[j++];
        }

        while (i < m) {
            outputArr[k++] = nums1[i++];
        }
        while (j < n) {
            outputArr[k++] = num2[j++];
        }

        nums1 = outputArr.clone();

        for (int l = 0; l < m + n; l++)
            System.out.println(nums1[l]);
    }


}
