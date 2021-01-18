//https://www.youtube.com/watch?v=xF3TU-QlhJQ
//https://www.geeksforgeeks.org/merge-two-sorted-arrays/

package array;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 4, 6, 8, 10};
        int[] arr2 = {1, 2, 3, 5, 11, 12, 15, 18};
        int[] arr = mergeTwoSortedArrays(arr1, arr2);
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr3 = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
//        if(len1 > 0 && len2 > 0) {
//            return;
//        }
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < len1) {
            arr3[k++] = arr1[i++];
        }
        while (j < len2) {
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }
}
