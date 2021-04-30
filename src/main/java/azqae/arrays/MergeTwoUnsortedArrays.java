package azqae.arrays;

import java.util.Arrays;

/**
 * Created by Ashok Kolli on 4/28/2021
 */

public class MergeTwoUnsortedArrays {

    public static void main(String[] args) {
        int[] a = {10, 5, 15};
        int[] b = {20, 3, 2};
        mergeTwoUnsortedArrays(a, b);

    }

    public static Integer[] mergeTwoUnsortedArrays(int[] arrOne, int[] arrTwo) {
        int i = 0, j = 0, k = 0;
        Integer[] outputArr = new Integer[arrOne.length + arrTwo.length];
        while (i < arrOne.length) {
            outputArr[k++] = arrOne[i++];
        }
        while (j < arrTwo.length) {
            outputArr[k++] = arrTwo[j++];
        }
        Arrays.sort(outputArr);
        for (int l = 0; l < outputArr.length; l++)
            System.out.println(outputArr[l]);

        return outputArr;
    }

}
