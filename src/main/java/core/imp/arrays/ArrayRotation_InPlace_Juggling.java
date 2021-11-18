package core.imp.arrays;

public class ArrayRotation_InPlace_Juggling {

    // Driver program to test above functions
    public static void main(String[] args) {
        ArrayRotation_InPlace_Juggling rotate = new ArrayRotation_InPlace_Juggling();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }

    /*UTILITY FUNCTIONS*/

    // Java program to rotate an core.array by
// d elements
    /*Function to left rotate arr[] of siz n by d*/
    void leftRotate(int[] arr, int k, int n) {
        int i, j, d, temp;
        for (i = 0; i < gcd(k, n); i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            d = (j + k) % n;
            while (d == i) {
                d = j + k;
                if (d >= n)
                    d = d - n;

                arr[j] = arr[d];
                j = d;
            }
            arr[j] = temp;
        }
    }

    /* function to print an core.array */
    void printArray(int[] arr, int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /*Fuction to get gcd of a and b*/
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}

// This code has been contributed by Mayank Jaiswal


