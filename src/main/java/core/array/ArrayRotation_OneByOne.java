package core.array;

public class ArrayRotation_OneByOne {

    // Java program to rotate an core.array by
// d elements

    // Driver program to test above functions
    public static void main(String[] args) {
        ArrayRotation_OneByOne rotate = new ArrayRotation_OneByOne();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }

    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int[] arr, int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    /* utility function to print an core.array */
    void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

// This code has been contributed by Mayank Jaiswal


