package core.tiktok.arrays;

public class SortedSquareRoot {

    public static void sortSquares(int[] arr)
    {
        int n = arr.length;
        // first dived core.array into part negative and positive
        int k;
        for (k = 0; k < n; k++) {
            if (arr[k] >= 0)
                break;
        }

        // Now do the same process that we learn
        // in merge sort to merge to two sorted core.array
        // here both two half are sorted and we traverse
        // first half in reverse meaner because
        // first half contain negative element
        int i = k - 1; // last index of first half
        int j = k; // Initial index of second half
        int ind = 0; // Initial index of temp core.array

        int[] temp = new int[n];
        while (i >= 0 && j < n) {
            if (arr[i] * arr[i] < arr[j] * arr[j]) {
                temp[ind] = arr[i] * arr[i];
                i--;
            }
            else {

                temp[ind] = arr[j] * arr[j];
                j++;
            }
            ind++;
        }

        while (i >= 0) {
            temp[ind++] = arr[i] * arr[i];
            i--;
        }
        while (j < n) {
            temp[ind++] = arr[j] * arr[j];
            j++;
        }

        // copy 'temp' core.array into original core.array
        System.arraycopy(temp, 0, arr, 0, n);
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int[] arr = { -6, -3, -1, 2, 4, 5 };
        System.out.println("Before sort ");
        for (int j : arr) System.out.print(j + " ");
        sortSquares(arr);
        System.out.println("After Sort ");
        for (int j : arr) System.out.print(j + " ");
    }
}
