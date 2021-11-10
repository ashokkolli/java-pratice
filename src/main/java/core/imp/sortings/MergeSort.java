package core.imp.sortings;

/**
 * Created by Ashok Kolli on 5/1/2021
 */

public class MergeSort {

    public static void merge(int[] arr, int l, int m, int r) {
        //calculating sizes of temp arrays
        int leftArrLen = m - l + 1;
        int rightArrLen = r - m;

        //Declare two temp arrays
        int[] tempLeftArr = new int[leftArrLen];
        int[] tempRightArr = new int[rightArrLen];

        //Copying into temp arrays
        for (int i = 0; i < leftArrLen; i++) {
            tempLeftArr[i] = arr[l + i];
        }
        for (int j = 0; j < rightArrLen; j++) {
            tempRightArr[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < leftArrLen && j < rightArrLen) {
            if (tempLeftArr[i] <= tempRightArr[j]) {
                arr[k++] = tempLeftArr[i++];
            } else
                arr[k++] = tempRightArr[j++];
        }

        //copy rest of the values
        while (i < leftArrLen) {
            arr[k++] = tempLeftArr[i++];
        }
        while (j < rightArrLen) {
            arr[k++] = tempRightArr[j++];
        }
    }

    public void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            //Sort the left sub core.array;
            sort(arr, l, m);
            //Sort the right sub core.array
            sort(arr, m + 1, r);
            //Merge sorted sub arrays

        }
    }
}
