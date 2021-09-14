//https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html
//https://www.cs.cmu.edu/~tcortina/15-121sp10/Unit06B.pdf

package core.array;

public class KLargestElementsWithMinHeap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int size, k = 3;
        int[] arr = {5, 9, 3, 2, 8};
        size = arr.length;
        kLargestElements(arr, size, k);

    }


    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void minHeapify(int[] arr, int size, int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int smallest = index;
        if (left < size && arr[left] < arr[smallest])
            smallest = left;
        if (right < size && arr[right] < arr[smallest])
            smallest = right;
        if (smallest != index) {
            swap(arr[index], arr[smallest]);
            minHeapify(arr, size, smallest);
        }
    }


    static void buildMinHeap(int[] arr, int size) {
        int index;
        for (index = size / 2; index >= 0; index--)
            minHeapify(arr, size, index);
    }

    static void printKElements(int[] minHeap, int k) {
        int index;
        for (index = 0; index < k; index++)
            System.out.println(minHeap[index]);
    }

    public static void kLargestElements(int[] arr, int size, int k) {
        int index;
        buildMinHeap(arr, k);
        for (index = k; index < size; index++) {
            if (arr[index] > arr[0]) {
                arr[0] = arr[index];
                minHeapify(arr, k, 0);
            }
        }
        printKElements(arr, k);
    }
}
