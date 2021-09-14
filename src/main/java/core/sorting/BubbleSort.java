package core.sorting;

//Given- arr = {5 1 4 2 8}
//Assumptions - Array is empty
//Array is more than one element 
//Array is not sorted already

//Bubble sort - compare adjacent elements when they are not in sorted order
//Approach 

public class BubbleSort {

    public static void main(String[] arg) {
        int[] arr = {5, 1, 4, 2, 8};
        int size = arr.length;
        bubbleSort(arr, size);
        printArray(arr, size);
    }

    static void bubbleSort(int[] arr, int size) {
        // Her size-1 because comparisons will be n-1 for n elements
        for (int i = 0; i < size - 1; i++) {
            //We gave n-j-1 because after each pass one max element will be on in right //place

            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }


    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.println(arr[i]);
    }

}
