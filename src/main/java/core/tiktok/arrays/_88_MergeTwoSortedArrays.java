package core.tiktok.arrays;

/**
 * Created by Ashok Kolli on 4/27/2021
 */

public class _88_MergeTwoSortedArrays {


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6};
        int[] arr2 = {2, 5, 8};
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] outputArr = new int[len1 + len2];

        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j])
                outputArr[k++] = arr1[i++];
            else
                outputArr[k++] = arr2[j++];
        }

        while (i < len1) {
            outputArr[k++] = arr1[i++];
        }
        while (i < len2) {
            outputArr[k++] = arr2[j++];
        }

        for (int l = 0; l < len1 + len2; l++)
            System.out.println(outputArr[l]);
    }


}
