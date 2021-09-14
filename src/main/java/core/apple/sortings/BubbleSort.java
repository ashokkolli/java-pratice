package core.apple.sortings;

/**
 * Created by Ashok Kolli on 5/1/2021
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArr = {5, 1, 4, 2, 8};
        //Bubble sort is the simplest core.sorting algorithm that works by repeatedly swapping
        //adjacent elements if they are in wrong order

        // Above core.array will be sorted in 2 Passes, but it needs to complete all the passes as it
        // doesn't smartly identify if it's sorted or not
        sort(unsortedArr);
        for (int i = 0; i < unsortedArr.length; i++)
            System.out.println(unsortedArr[i]);
    }

    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j);
            }
        }
    }

    public static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
