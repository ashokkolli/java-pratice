package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int l = 0;
        int h = arr.length;
        quicksort(arr, l, h);

    }

    public static void quicksort(int[] arr, int l, int h) {
        if (l < h) {
            int pivotIndex = partition(arr, l, h);
            quicksort(arr, l, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = l;
        int i = l;
        int j = h;
        while (i < j) {
            while (arr[l] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < j)
                swap(arr[i], arr[j]);

        }
        swap(pivot, arr[j]);
        return j;
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
