package array.practice;

public class MergeTwoSortedArrays {


    public static void main(String[] args) {
        // When you say sorting, it's ascending or descending order
        //1. If one or two given arrays length are empty, then do not sort
        //2. Ask if given arrays are integer arrays or can be any characters..
        //You can check by Character.isDigit(literal)
        //if not, you can convert by Character.getNumericValue();
        // what could be the min and max size of the each array.
        // what should be the return value;
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] merge = new int[len1 + len2];
        merge = mergeTwoSortedArray(arr1, len1, arr2, len2);
        for (int i : merge)
            System.out.println(i);

    }

    public static int[] mergeTwoSortedArray(int[] arr1, int len1, int[] arr2, int len2) {
        int[] merge = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        if (len1 == 0 || len2 == 0)
            return merge;

        //Traversing both the arrays
        while (i < len1 && j < len2) {
            //checking if Current element of first array is less than second array
            //If yes store it in 3rd array
            if (arr1[i] < arr2[j]) {
                merge[k] = arr1[i++];
                k++;
            } else {
                merge[k] = arr2[j++];
                k++;
            }
        }
//Store remaining elements of first array to arr3
        while (i < len1) {
            merge[k] = arr1[i++];
        }
//Store reaming elements of 2nd array to arr2
        while (j != len2) {
            merge[k] = arr2[j++];
        }
        return merge;
    }
}
